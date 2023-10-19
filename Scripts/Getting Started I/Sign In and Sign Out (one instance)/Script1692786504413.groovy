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

'added delay'
Windows.delay(10)

//Windows.click(findWindowsObject('Object Repository/Getting Started/Edit'))
'Set email text'
Windows.setText(findWindowsObject('Object Repository/Getting Started/enterEmail'), 'yassir@quixel.se')

//Windows.click(findWindowsObject('Object Repository/Getting Started/Edit(1)'))
'Set password'
Windows.setText(findWindowsObject('Object Repository/Getting Started/enterPass'), 'kenwokurae0930')

'Click login button'
Windows.click(findWindowsObject('Object Repository/Getting Started/buttonLogin'))

'Added delay'
Windows.delay(3)

'Click button account'
Windows.click(findWindowsObject('Object Repository/Getting Started/ButtonAccount'))

'Click sign out button'
Windows.click(findWindowsObject('Object Repository/Getting Started/ButtonSignOut'))

'Added delay'
Windows.delay(3)

'Close application'
Windows.closeApplication()

