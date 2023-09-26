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

Thread.sleep(10000)

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/LeftPenalValidateButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/TripDropdown'))

Windows.setText(findWindowsObject('Object Repository/Left Penal - Validate/SearchTrip'), 'Mubeen')

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/SelectTrip1'))


//Need to work, if its checked then leave it and if its unchecked then check it 


Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/CheckBox'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/StartValidationButton'))

//def verifyScreen = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/ScreenValidator'))
//
//assert verifyScreen == 'MERGE'

Thread.sleep(15000)

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/CheckBox(1)'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/MergeAssets'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/CheckBox(1)'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/FinalValidateAssetsButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/OkButton'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/Pane'))



Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/UploadButton'))

Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/AssetInValidateUpload'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/AssetInValidateUpload'))

def verfiyAssetUpload = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/AssetInValidateUpload'))

println(verfiyAssetUpload)


println(Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/UploadStatus')))

String initialStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/UploadStatus'))

while (!initialStatus.equals('DONE')) {
	Windows.delay(10)  // Wait for 5 seconds before checking again
	initialStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/UploadStatus'))
}

assert verfiyAssetUpload == 'Desktop 1'






//Windows.click(findWindowsObject('Object Repository/Left Penal - Validate/PipelineButtonLeftPenal'))

//def verifyAsset = Windows.getText(findWindowsObject('Object Repository/Left Penal - Validate/AssetInPipeline'))
//
//assert verifyAsset == 'Desktop'

