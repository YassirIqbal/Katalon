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
'Added delay'
Thread.sleep(10000)

'Click pipeline'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Pipeline'))

'Click inbox'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Inbox'))

'Click search'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Search'))

'Set asset ID in search field'
Windows.setText(findWindowsObject('Object Repository/Pipeline/Inbox/AssetIdInSearchField'), 'Desktop')

'Press Enter key'
Windows.sendKeys(findWindowsObject('Object Repository/Pipeline/Inbox/EnterKey'), Keys.chord(Keys.ENTER))

'Click to open asset'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/OpenAsset'))

//Windows.getText(findWindowsObject('Object Repository/Pipeline/Inbox/GetAssetID'))
'Get asset ID'
GlobalVariable.AssetID = Windows.getText(findWindowsObject('Object Repository/Pipeline/Inbox/GetAssetID'))

'Clear the assignee field'
Windows.clearText(findWindowsObject('Object Repository/Pipeline/Inbox/AssigneeField'))

'Set the assignee field'
Windows.setText(findWindowsObject('Object Repository/Pipeline/Inbox/AssigneeField'), 'Mubeen')

'Select assignee'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedAssignee'))

'Click location\r\n'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Location'))

'Location is selected '
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedLocation'))

'Click category\r\n'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Category'))

'Category is selected'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedCategory'))

'Random click'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/RandomClick'))

//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Size'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedSize'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/AssetComponent'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/AssetComponent'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedassetComponent'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/MossGrowth'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedMossGrowth'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Color'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedColor'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/RandomClick'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/MeshType'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedMeshType'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SubMesh'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedSubMesh'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Region'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedRegion'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Country'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedCountry'))
//
//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Contains'))
//
//Windows.setText(findWindowsObject('Object Repository/Pipeline/Inbox/Contains'), 'Test')
'Click tileable'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Tileable'))

'Tileable selected'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/TileableSelection'))

'Set density '
Windows.setText(findWindowsObject('Object Repository/Pipeline/Inbox/Density'), '1024')

//Windows.setText(findWindowsObject('Object Repository/Pipeline/Inbox/Color1'), 'Gray')
'Click colour'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Color1'))

'Colour selected'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedColor'))

'Random click'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/RandomClick'))

'Click region '
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Region1'))

'Region selected'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedRegion'))

'Click Country'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Country1'))

'Country selected'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/SelectedCountry'))

'Click contains'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/Contains'))

'Set "contains"'
Windows.setText(findWindowsObject('Object Repository/Pipeline/Inbox/Contains'), 'Surface')

'Press enter to search'
Windows.sendKeys(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'), Keys.chord(Keys.ENTER))

'Click activity'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/ActivityClick'))

//Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/NextButton'))
'click next button'
Windows.click(findWindowsObject('Object Repository/Pipeline/Inbox/NextButton'))

'Added delay'
Thread.sleep(10000)

