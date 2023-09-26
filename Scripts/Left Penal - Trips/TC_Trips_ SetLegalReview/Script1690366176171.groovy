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
Thread.sleep(10000)
//
//
//Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SearchIcon'))
//
//Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'))
//
//Windows.setText(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'), 'Desktop')
//
//Windows.sendKeys(findWindowsObject('Object Repository/Left Penal - Trips/SearchField'), Keys.chord(Keys.ENTER))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/Legal Review/LegalReviewDropdown'))

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/Legal Review/LegalOption'))

Windows.switchToWindowTitle('Confirm')

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/Legal Review/Save'))

Windows.switchToWindowTitle('Quixel Tracker')

def verifyStatus = Windows.getText(findWindowsObject('Object Repository/Left Penal - Trips/Legal Review/LegalReviewStatus'))

//assert verifyStatus == 'Needs Review', "Selected value doesn't match the expected value"



