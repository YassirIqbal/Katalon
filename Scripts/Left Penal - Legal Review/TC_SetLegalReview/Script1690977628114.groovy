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

'Go to legal Review in AT '
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/LegalReview'))

//Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SearchIcon'))
//
//Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'))
//
//Windows.setText(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'), 'Desktop')
//
//Windows.sendKeys(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'), Keys.chord(Keys.ENTER))
'Added delay '
Thread.sleep(5000)

'Click an asset to open '
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/DataItem'))

'Click the dropdown to expand it'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/LegalReviewDropdowm'))

'Select passed status from the legal review dropdown'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/PassedReviewSelection'))

'Switch to confirmation window (pop up)'
Windows.switchToWindowTitle('Confirm')

'Click "Yes" option from pop up'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/YesButton'))

'Switched back to main application window'
Windows.switchToWindowTitle('Quixel Tracker')

//Assertion to check right value is selected 
'Get the legal reivew dropdown text (status)'
def verifyStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Legal Review/LegalReviewDropdownPassed'))

'Verifiy if "passed" is selected '
assert verifyStatus == 'Passed' : 'Selected value doesn\'t match the expected value'

'Click the legal review dropdown to open it '
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/LegalReviewDropdownPassed'))

'Click status "passed with comment" from the dropdown'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/PassedwithComment'))

'Switch to confirmation window (pop-up)'
Windows.switchToWindowTitle('Confirm')

'Click "Yes" option from pop up\r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/YesButton1'))

'Switched back to main applicaiton window'
Windows.switchToWindowTitle('Quixel Tracker')

//Assertion to check right value is selected
'Get the legal reivew dropdown text (status)'
def verifyStatus1 = Windows.getText(findWindowsObject('Object Repository/Left Penal - Legal Review/DropdownPassedWithComment'))

'Verifiy if "passed with comment" is selected '
assert verifyStatus1 == 'Passed with Comment' : 'Selected value doesn\'t match the expected value'

'Click status "passed with comment" from the dropdown'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/DropdownPassedWithComment'))

'Click Not needed (status)'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/NotNeeded'))

'Switch to confirmation window (pop up)'
Windows.switchToWindowTitle('Confirm')

'Click "Yes" option from pop up'
Windows.click(findWindowsObject('Object Repository/Left Penal - Legal Review/YesButton2'))

'Switched back to main application window'
Windows.switchToWindowTitle('Quixel Tracker')

