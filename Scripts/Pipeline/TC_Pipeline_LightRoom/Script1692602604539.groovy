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
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.stream.Collectors
import java.nio.file.Files



//Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')



Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Lightroom'))

def verifyAsset = Windows.getText(findWindowsObject('Object Repository/Pipeline/Inbox/AssetID'))

GlobalVariable.AssetID = verifyAsset

Thread.sleep(10000)

Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/Asset'))

Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/FolderButton'))

//GlobalVariable.AssetID = "xjeifeu"
Path sourceFolder = Paths.get("C:\\Users\\Quixel\\Desktop\\For LR Folder");
Path destinationFolder = Paths.get("C:\\Users\\Quixel\\Desktop\\Destination\\" + GlobalVariable.AssetID + "\\lr-" + GlobalVariable.AssetID);

//Path destinationFolder = Paths.get("C:\\Users\\Quixel\\Documents\\Asset Tracker Downloads\\" + GlobalVariable.AssetID + "\\lr-" + GlobalVariable.AssetID);

// Find all files in the source folder
List<Path> files = Files.list(sourceFolder)
	.filter(new java.util.function.Predicate<Path>() {
		@Override
		boolean test(Path p) {
			Files.isRegularFile(p)
		}
	})
	.collect(Collectors.toList())
	println(files)

// Copy each file from source to destination
for (Path file : files) {
	
	System.out.println("Source file: " + file.toString());
	
	Path destinationFile = destinationFolder.resolve(file.getFileName());
	Files.copy(file, destinationFile, StandardCopyOption.REPLACE_EXISTING);
	
	// Log success message for each file
	println("File copied successfully from " + file.toString() + " to " + destinationFile.toString())
}

Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/NextButton'))

Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/UploadButton'))


//
//Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/RealityCapture'))
//
//Windows.getText(findWindowsObject('Object Repository/Pipeline/LightRoom/AssetID'))
//
////def verifyAsset = Windows.getText(findWindowsObject('Object Repository/Pipeline/Inbox/AssetID'))
//
////assert verifyAsset == GlobalVariable.AssetID

