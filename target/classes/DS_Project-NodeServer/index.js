/**
 * http://usejsdoc.org/
 */
var grpc = require("grpc");
var events = require("events");
// add the bookStream global variable
var phoneStream = new events.EventEmitter();
var phoneProto = grpc.load("Phone.proto");
var phoneDevice = {
  pname: "Phone",
  status: "On",
  app: "No Apps On",
  battery: 52
};
var server = new grpc.Server();
server.bind("0.0.0.0:1237", grpc.ServerCredentials.createInsecure());
console.log("Server running at http://0.0.0.0:1237");

server.addService(phoneProto.EBankGRPC.PhoneService.service, {
  initialDevice: function (call, callback) {
    callback(null, phoneDevice);
  },
  changeApplication: function (call, callback) {
    // console.log(call)
    var appName = call.request.text;
    if (appName == "Select an Application") {
    	phoneDevice.app = "No Apps On";
    } else {
    	phoneDevice.app = appName
    }
    //console.log(appName)

    return callback(null, phoneDevice.app);
  },

  changeBattery: function (call, callback) {
    var reqBattery = call.request.length;
    var new_battery = phoneDevice.battery + reqBattery
    if (new_battery < 100 && new_battery >= 0) {
      phoneDevice.battery = new_battery;
    }
    console.log(phoneDevice);
    return callback(null, phoneDevice.battery);
  },
  onOff: function (call, callback) {
    var reqVal = call.request.msg
    console.log(reqVal)
    if (reqVal == true) {
    	phoneDevice.status = "On"
    } else {
    	phoneDevice.status = "Off"
    }
    var resp;
    if (phoneDevice.status == "On") {
      resp = true;
    } else {
      resp = false;
    }
    callback(null, resp);
  },
  changeDevicePhoneName = call.request.text
    PhoneDevice.pname = reqName
    console.log("Name" + phoneDevice.pname);

    callback(null, phoneDevice.pname);
  }
});

server.start();
// In-memory array of book objects