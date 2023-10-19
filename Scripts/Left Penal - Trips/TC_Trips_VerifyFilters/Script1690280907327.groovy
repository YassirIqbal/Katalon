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
'Added delay '
Thread.sleep(15000)

'Click the user filter '
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/UserFilter'))

'Set the text in the field "Mubeen"'
Windows.setText(findWindowsObject('Object Repository/Left Penal - Trips/TextInUserFilter'), 'Mubeen')

'Click the user from the results'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedUserFromUserFilter'))

'Get the text of the user to verify selected user is correct'
String verifyUser = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/UserInAsigneeColumn'))

'Verify user '
assert verifyUser == 'Muhammad Mubeen update'

'Click to reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Click the scanner filter\r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ScannerFilter'))

'Set the text in the field "Mubeen"'
Windows.setText(findWindowsObject('Object Repository/Left Penal - Trips/ScannerFilter'), 'Mubeen')

'Click the user from the results'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectUserFromScannerFilter'))

'Click to reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Click the priority filter\r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/Priority1'))

'Select the priority '
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/PrioritySelection'))

//String verifyPriority = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/PriorityInTable'))
//
//assert verifyPriority == 'Medium'
'Click to reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Click the asset type filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/AssetTypeFilter'))

'Click to select the asset type'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedAssetType'))

'Get the text to verify the asset type '
String verifyAssetType = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/AssetTypeInTable'))

'Verify the asset type is 3D plant'
assert verifyAssetType == '3D Plant'

'Click to reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Cick to open the dropdown filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

'Click the studio filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/StudioFilter'))

'Studio filter selected from the filters\r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedStudioInFilter'))

////
//Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/StudioInTable'))
////
'Reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

//
'Added delay'
Thread.sleep(500)

'Click to open the dropdown filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

'Click the stage filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/StageFilter'))

'Selected stage in the fillters\r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedStageInFilter'))

//String verifyStage = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/StageInTable'))
//
//assert verifyStage == "Lightroom"
'Reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Click to open the dropdown filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

'Click the status filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/StatusFilter'))

'Status selected in the filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedStatusInFilter'))

//String verifyStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/StatusInTable'))
//
//assert verifyStatus == "Scanned"
'Reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Click to open the dropdown filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

'Click the legal status filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/LegalStatusFilter'))

'Legal status is selected'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectedLegalStatusInFilter'))

//String verifyLegalStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/LegalStatusInTable'))
//
//assert verifyLegalStatus == "Passed"
'Reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

'Added delay'
Thread.sleep(500)

'Click to open the dropdown filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/DropdownFilter'))

'Click the all time filter'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/AllTimeFilter'))

'All time in filter selected'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SelectAllTimeInFilter'))

'Reset the filters'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ResetFilters'))

