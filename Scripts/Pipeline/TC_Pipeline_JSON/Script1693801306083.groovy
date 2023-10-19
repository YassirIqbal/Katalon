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
import groovy.json.JsonOutput as JsonOutput
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
//import org.everit.json.schema.Schema
//import org.everit.json.schema.loader.SchemaLoader
import org.json.JSONObject as JSONObject
import groovy.json.JsonBuilder as JsonBuilder

//Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')
'Added delay'
Thread.sleep(20000)

'Click QA '
Windows.click(findWindowsObject('Object Repository/Pipeline/Processing/QA'))

'Click Asset on QA'
Windows.click(findWindowsObject('Object Repository/Pipeline/QA/AssetOnQA'))

'Click asset JSON'
Windows.click(findWindowsObject('Object Repository/Pipeline/Json/AssetJson'))

Windows.click(findWindowsObject('Object Repository/Pipeline/Json/Button'))

'Added delay'
Thread.sleep(120000)

'Click upload status'
Windows.click(findWindowsObject('Object Repository/Pipeline/Json/UploadStatus'))

'click cancel all '
Windows.click(findWindowsObject('Object Repository/Pipeline/Json/CancelAll'))

'Click clear all'
Windows.click(findWindowsObject('Object Repository/Pipeline/Json/ClearAll'))

// Define the path to JSON files
'JSON file path'
def surfaceJsonFilePath = 'C:\\Users\\Quixel\\Downloads\\sufaces_schema_v2_after_qa_stage.json'

//def jsonSchemaFilePath = ((('C:\\Users\\Quixel\\Documents\\Asset Tracker Downloads\\' + 'xdilahmqx') + '\\qa-') + 'xdilahmqx') + 
//'\\xdilahmqx.json'
//def jsonSchemaFilePath = "C:\\Users\\Quixel\\Documents\\Asset Tracker Downloads\\" + GlobalVariable.AssetID + "\\qa-" + GlobalVariable.AssetID + "\\" + GlobalVariable.AssetID + ".json"
'JSON schema file path'
def jsonSchemaFilePath = ((((('C:\\Users\\Quixel\\Desktop\\Destination\\' + GlobalVariable.AssetID) + '\\qa-') + GlobalVariable.AssetID) + 
'\\') + GlobalVariable.AssetID) + '.json'

// Read the contents of the JSON files
'Parse JSON '
def surfaceJsonContents = new File(surfaceJsonFilePath).text

'Parse JSON schema'
def jsonSchemaContents = new File(jsonSchemaFilePath).text

'Compare JSON with JSON schema to verify '
boolean successful = WS.validateJsonAgainstSchema(jsonSchemaContents, surfaceJsonContents)

'Check if JSON verification is success'
if (successful) {
    println('JSON schema validation passed')
} else {
    'JSON verification failed'
    println('JSON schema validation failed')
}

