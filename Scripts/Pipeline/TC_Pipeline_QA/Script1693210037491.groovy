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
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.nio.file.StandardCopyOption as StandardCopyOption
import java.util.stream.Collectors as Collectors

//Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')
'Added delay'
Thread.sleep(15000)

'Click QA stage'
Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/QA'))

'Click the asset on QA stage'
Windows.click(findWindowsObject('Object Repository/Pipeline/QA/AssetOnQA'))

'Click next button'
Windows.click(findWindowsObject('Object Repository/Pipeline/QA/NextButton'))

'Click upload button'
Windows.click(findWindowsObject('Object Repository/Pipeline/QA/UploadButton'))

////////////////////Verification part ////////////////////////////////////////////////////
'Click CC Reg'
Windows.click(findWindowsObject('Object Repository/Pipeline/QA/CC Reg'))

'Click asset on CC Reg'
Windows.click(findWindowsObject('Object Repository/Pipeline/QA/AssetOnCCReg'))

