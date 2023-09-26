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

//Windows.setText(findWindowsObject('Object Repository/Sign In/Edit'), 'muhammad.mubeen+1@epicgames.quixel.com')
//
//Windows.setText(findWindowsObject('Object Repository/Sign In/Edit(1)'), 'Mubeen@123')
//
//Windows.click(findWindowsObject('Object Repository/Sign In/Text'))
//
//def verifySignIn = Windows.getText(findWindowsObject('Object Repository/Sign In/Text(1)'))
//
//assert verifySignIn == 'TRIPS'

Thread.sleep(15000)

//Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/ScannedAt'), 10, FailureHandling.OPTIONAL)
//Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/ScannedAt'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Images'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Title'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/LegalReview'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Status'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Assignee'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Priority1'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Stage'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Studio'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/CreatedBy'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Type'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/CameraIndex'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/ProxyMesh'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Trip'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Location'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/ID'), 10, FailureHandling.CONTINUE_ON_FAILURE)

Windows.verifyElementPresent(findWindowsObject('Object Repository/Left Penal - Trips/Coordinates'), 10, FailureHandling.CONTINUE_ON_FAILURE)

