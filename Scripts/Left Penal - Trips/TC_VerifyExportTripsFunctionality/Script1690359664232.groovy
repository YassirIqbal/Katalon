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
'Added delay '
Thread.sleep(5000)

'Click export button \r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ExportTrips/ExportButton'))

'Added delay'
Thread.sleep(5000)

'Click the desktop path on system'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ExportTrips/DesktopPath'))

'Added delay\r\n'
Thread.sleep(5000)

'Click the save button\r\n'
Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ExportTrips/SaveButton'))

'Added delay'
Thread.sleep(5000)

'Set path '
def downloadPath = 'C://Users//Quixel//Desktop' // replace with your desired download path

// verify that the file is downloaded successfully
'Path where the file is downloaded '
def file = new File(downloadPath + '\\Trips.csv')

'Check if file exists on the given path earlier'
assert file.exists()

// verify the name of the downloaded file
'Checking the name of the file to verify '
assert file.getName() == 'Trips.csv'

