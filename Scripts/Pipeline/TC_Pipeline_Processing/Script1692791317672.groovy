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

//Windows.click(findWindowsObject('Object Repository/Pipeline/QA/AssetOnProcessing'))
////////////////////////////////////Files copy to QA Folder///////////////////////////

Thread.sleep(15000)



Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/Processing'))



def verifyScreen = Windows.getText(findWindowsObject('Object Repository/Pipeline/Reality Capture/AssetonProcessing'))

assert verifyScreen == 'Desktop 1'

Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/AssetonProcessing'))


Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/UploadPopupRC'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/ClearAll'))

///////////////////
Path sourceFolder = Paths.get('C://Users//Quixel//Desktop//For QA Folder')

Path destinationFolder = Paths.get("C:\\Users\\Quixel\\Desktop\\Destination\\$GlobalVariable.AssetID\\qa-$GlobalVariable.AssetID")

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
println(files)

// Copy each file from source to destination
for (Path file : files) {
    Path destinationFile = destinationFolder.resolve(file.getFileName())

    Files.copy(file, destinationFile, StandardCopyOption.REPLACE_EXISTING)

    // Log success message for each file
    println((('File copied successfully from ' + file.toString()) + ' to ') + destinationFile.toString())
}
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/Processing'))
//
Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/AssetOnProcessing'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/NextButton'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/OverWriteButton'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/uploadMain'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/AssetNameUploaddropdown'))

def timeout = 1000 // Timeout in seconds

def pollingInterval = 1 // Interval between each check in seconds

def desiredText = 'DONE'

// Define the start time and end time for timeout calculation
def startTime = System.currentTimeMillis()

def endTime = startTime + (timeout * 1000)

// Loop until the timeout is reached
while (System.currentTimeMillis() < endTime) {
    try {
        // Find the Windows Object representing the element
        def elementObject = findWindowsObject('Object Repository/Pipeline/Reality Capture/DoneText')

        // Find the element using the Windows Object
        def textElement = Windows.findElement(elementObject)

        // Check if the element's text matches the desired text
        if (textElement.getText() == desiredText) {
            println("Desired text found: $desiredText")

            def check = textElement.getText()

            println("Desired text foundddddddddddddddddddddddddddddddd: $check")

            // Perform the next step after the text is found
            break
        }
    }
    catch (Exception e) {
        // Element not found or other exception occurred, continue to check
    } 
    
    // Sleep for the polling interval before the next check
    Thread.sleep(pollingInterval * 1000)
}

// Check if the desired text is found
if (System.currentTimeMillis() >= endTime) {
    println("Final Desired text found: $desiredText")
}



