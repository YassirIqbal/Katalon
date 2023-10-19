import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.nio.file.StandardCopyOption as StandardCopyOption
import java.util.stream.Collectors as Collectors

//Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')
'Click lightroom\r\n\r\n'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Lightroom'))

'Get the text to verify Asset'
def verifyAsset = Windows.getText(findWindowsObject('Object Repository/Pipeline/Inbox/AssetID'))

'Saving asset ID in global variable\r\n'
GlobalVariable.AssetID = verifyAsset

'Added delay'
Thread.sleep(10000)

'Click the asset'
Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/Asset'))

'Click folder button\r\n'
Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/FolderButton'))

//GlobalVariable.AssetID = "xjeifeu"
'Setting the source folder path'
Path sourceFolder = Paths.get('C:\\Users\\Quixel\\Desktop\\For LR Folder')

'Setting the destination folder path'
Path destinationFolder = Paths.get((('C:\\Users\\Quixel\\Desktop\\Destination\\' + GlobalVariable.AssetID) + '\\lr-') + 
    GlobalVariable.AssetID)

//Path destinationFolder = Paths.get("C:\\Users\\Quixel\\Documents\\Asset Tracker Downloads\\" + GlobalVariable.AssetID + "\\lr-" + GlobalVariable.AssetID);
// Find all files in the source folder
'Copying the files to destination'
List<Path> files = Files.list(sourceFolder).filter(new script1697530634527$1()).collect(Collectors.toList())

'Printing the files name'
println(files)

// Copy each file from source to destination
'Moving the files'
for (Path file : files) {
    System.out.println('Source file: ' + file.toString())

    Path destinationFile = destinationFolder.resolve(file.getFileName())

    Files.copy(file, destinationFile, StandardCopyOption.REPLACE_EXISTING)

    // Log success message for each file
    println((('File copied successfully from ' + file.toString()) + ' to ') + destinationFile.toString())
}

'Click on next button'
Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/NextButton'))

'Click on upload button'
Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/UploadButton'))

