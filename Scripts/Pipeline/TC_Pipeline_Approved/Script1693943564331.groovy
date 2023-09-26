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

Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')

Windows.setText(findWindowsObject('Object Repository/Sign In/Edit'), 'muhammad.mubeen+1@epicgames.quixel.com')

Windows.setText(findWindowsObject('Object Repository/Sign In/Edit(1)'), 'Mubeen@123')

Windows.click(findWindowsObject('Object Repository/Sign In/Text'))

def verifySignIn = Windows.getText(findWindowsObject('Object Repository/Sign In/Text(1)'))

assert verifySignIn == 'TRIPS'

Thread.sleep(10000)



Windows.click(findWindowsObject('Object Repository/Pipeline/Approved/Approve'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Approved/AssetOnApprove'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Approved/Approved'))



Windows.click(findWindowsObject('Object Repository/Pipeline/Approved/Text'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Approved/Custom'))

//
//def assetName = Windows.getText(findWindowsObject('Object Repository/Pipeline/Approved/Edit')).toUpperCase()
//println(assetName)
def assetID = Windows.getText(findWindowsObject('Object Repository/Pipeline/Approved/Edit(1)'))

Thread.sleep(10000)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-staging3.quixel.com/megascans/home?assetId=' + assetID)

def webAssetName = WebUI.getText(findTestObject('Object Repository/Pipeline/Approved/Page_Quixel Mod_test1/div_Mod_test1'))

println(webAssetName)

