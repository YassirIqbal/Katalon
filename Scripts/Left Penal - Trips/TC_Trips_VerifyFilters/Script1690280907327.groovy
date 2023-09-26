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


Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/UserFilter'))

Windows.setText(findWindowsObject('Object Repository/Left Penal - Trips/TextInUserFilter'), 'Mubeen')

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedUserFromUserFilter'))

String verifyUser = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/UserInAsigneeColumn'))

assert verifyUser == "Muhammad Mubeen update" 

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)


Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ScannerFilter'))

Windows.setText(findWindowsObject('Object Repository/Left Penal - Trips/ScannerFilter'), 'Mubeen')

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectUserFromScannerFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)


Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/Priority1'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/PrioritySelection'))

//String verifyPriority = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/PriorityInTable'))
//
//assert verifyPriority == 'Medium'

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)


Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/AssetTypeFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedAssetType'))

String verifyAssetType = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/AssetTypeInTable'))

assert verifyAssetType == "3D Plant"

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/StudioFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedStudioInFilter'))
////
//Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/StudioInTable'))
////
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))
//
Thread.sleep(500)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/StageFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedStageInFilter'))

//String verifyStage = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/StageInTable'))
//
//assert verifyStage == "Lightroom"

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/StatusFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedStatusInFilter'))

//String verifyStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/StatusInTable'))
//
//assert verifyStatus == "Scanned"

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/LegalStatusFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedLegalStatusInFilter'))

//String verifyLegalStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/LegalStatusInTable'))
//
//assert verifyLegalStatus == "Passed"

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

Thread.sleep(500)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/AllTimeFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectAllTimeInFilter'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))
