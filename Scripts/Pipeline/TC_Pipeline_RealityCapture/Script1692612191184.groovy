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
import java.awt.Robot as Robot
import java.awt.event.InputEvent as InputEvent
import com.kms.katalon.core.util.KeywordUtil
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption
import java.util.stream.Collectors
import java.nio.file.Files

//Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')
//
//Windows.setText(findWindowsObject('Object Repository/Sign In/Edit'), 'muhammad.mubeen+1@epicgames.quixel.com')
//
//Windows.setText(findWindowsObject('Object Repository/Sign In/Edit(1)'), 'Mubeen@123')
//
//Windows.click(findWindowsObject('Object Repository/Sign In/Text'))
//
//def verifySignIn = Windows.getText(findWindowsObject('Object Repository/Sign In/Text(1)'))
//
//assert verifySignIn == 'TRIPS'
//
Thread.sleep(15000)

//Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/pipeline'))
//
////Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/lightroom'))
//Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/RC'))


Windows.click(findWindowsObject('Object Repository/Pipeline/LightRoom/RealityCapture'))

Windows.getText(findWindowsObject('Object Repository/Pipeline/LightRoom/AssetID'))

//def verifyAsset = Windows.getText(findWindowsObject('Object Repository/Pipeline/Inbox/AssetID'))

//assert verifyAsset == GlobalVariable.AssetID

Thread.sleep(5000)


Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/UploadPopupRC'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/ClearAll'))

///////////////////////////////// copy Files code  //////////////////////////////////////


Path sourceFolder = Paths.get("C://Users//Quixel//Desktop//For RC Folders//3D//3D//Model Files")
Path destinationFolder = Paths.get("C:\\Users\\Quixel\\Desktop\\Destination\\${GlobalVariable.AssetID}\\rc-${GlobalVariable.AssetID}")

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
	Path destinationFile = destinationFolder.resolve(file.getFileName());
	Files.copy(file, destinationFile, StandardCopyOption.REPLACE_EXISTING);
	
	// Log success message for each file
	println("File copied successfully from " + file.toString() + " to " + destinationFile.toString())
}




////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////Copy to PReviz folder ////////////////////////////////


Path sourceFolder1 = Paths.get("C://Users//Quixel//Desktop//for previous folder")
Path destinationFolder1 = Paths.get("C:\\Users\\Quixel\\Desktop\\Destination\\" + GlobalVariable.AssetID + "\\previz-" + GlobalVariable.AssetID + "\\rc-proj-" + GlobalVariable.AssetID)
println(destinationFolder1)

// Find the file in the source folder
Path fileToCopy = Files.list(sourceFolder1)
		.filter(new java.util.function.Predicate<Path>() {
			boolean test(Path p) {
				Files.isRegularFile(p)
			}
		})
		.findFirst()
		.orElseThrow{ new Exception("No file found in the source folder") }

// Get the original filename and extension
Path fileName1 = fileToCopy.getFileName()
String extension1 = fileName1.toString().substring(fileName1.toString().lastIndexOf("."))

// Rename the file to xd3kfgj.rcproj
Path renamedFile = sourceFolder.resolve("${GlobalVariable.AssetID}.rcproj")
Files.move(fileToCopy, renamedFile, StandardCopyOption.REPLACE_EXISTING)

// Copy the renamed file to the destination folder
Path destinationFile1 = destinationFolder.resolve("xd3kfgj.rcproj")
Files.copy(renamedFile, destinationFile1, StandardCopyOption.REPLACE_EXISTING)

// Log success message
println("File copied successfully from " + renamedFile.toString() + " to " + destinationFile1.toString())


/////////////////////////////////////////////////////////////////////////////////////////////


Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/Text(1)'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/Next'))

Thread.sleep(10000)

Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/uploadPopup'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/uploadMain'))

//Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/AssetNameUploaddropdown'))

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
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/DoneIcon'))
//
//assert findWindowsObject('Object Repository/Pipeline/Reality Capture/DoneIcon') // Make sure Done icon is showing after completing the upload

//Thread.sleep(5000)
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/Processing'))
//
//
//
//def verifyScreen = Windows.getText(findWindowsObject('Object Repository/Pipeline/Reality Capture/AssetonProcessing'))
//
//assert verifyScreen == 'Desktop 1'
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Reality Capture/AssetonProcessing'))

//Windows.closeApplication()

