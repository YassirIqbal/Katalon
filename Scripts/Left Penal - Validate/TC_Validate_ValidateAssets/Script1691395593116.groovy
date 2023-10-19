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
'Added delay '
Thread.sleep(10000)

'Select Validate stage '
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/LeftPenalValidateButton'))

'Open trip dropdown'
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/TripDropdown'))

'Search the required trip'
Windows.setText(findWindowsObject('Object Repository/Left Penal - Validate/SearchTrip'), 'Mubeen')

'Trip selected '
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/SelectTrip1'))

//Need to work, if its checked then leave it and if its unchecked then check it 
'Select checkbox'
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/CheckBox'))

'Click validation button to go to Validation part 2 '
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/StartValidationButton'))

//def verifyScreen = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/ScreenValidator'))
//
//assert verifyScreen == 'MERGE'
'Added delay'
Thread.sleep(15000)

'Select checkbox'
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/CheckBox(1)'))

'Merge the required assets'
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/MergeAssets'))

'Select checkbox'
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/CheckBox(1)'))

'Validate the asset'
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/FinalValidateAssetsButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/OkButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/Pane'))

'Click upload button '
Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/UploadButton'))

Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/AssetInValidateUpload'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/AssetInValidateUpload'))

'Verify asset is uploaded'
def verfiyAssetUpload = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/AssetInValidateUpload'))

'Verify status of the upload '
println(verfiyAssetUpload)

'Verify the name of the uploading asset'
println(Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/UploadStatus')))

'Get the text of upload status'
String initialStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/UploadStatus'))

'Loop unless the "Done" status appears '
while (!(initialStatus.equals('DONE'))) {
    Windows.delay(10 // Wait for 5 seconds before checking again
        )

    initialStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/UploadStatus'))
}

'Confirm asset name and verify it'
assert verfiyAssetUpload == 'Desktop 1'

