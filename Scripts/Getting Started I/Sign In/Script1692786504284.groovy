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

'Launch application - launch Asset Tracker'
Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Asset Tracker')

'Added delay '
Windows.delay(2)

'Click for enter email'
Windows.click(findWindowsObject('Object Repository/Getting Started/enterEmail'))

'Set email in the required field (email is already pre set as Input value) '
Windows.setText(findWindowsObject('Object Repository/Getting Started/enterEmail'), 'yassir@quixel.se')

'Click for enter password'
Windows.click(findWindowsObject('Object Repository/Getting Started/enterPass'))

'Set password in the requried field (password input value is already set)'
Windows.setText(findWindowsObject('Object Repository/Getting Started/enterPass'), 'kenwokurae0930')

'Click log in button for log in'
Windows.click(findWindowsObject('Object Repository/Getting Started/buttonLogin'))

'added delay'
Windows.delay(3)

'For Trip stage confiramtion, it should have Trips in heading for successfull validation'
def actualText = Windows.getText(findWindowsObject('Object Repository/Getting Started/textTripsHeading'))

'An assert statement contains a boolean expression where this condition must hold true for the test execution to continue'
assert actualText == 'TRIPS' : 'Step fails if text does not match'

'Print line in console log : User signed in and navigated to correct page '
println('User signed in and navigated to correct page')

