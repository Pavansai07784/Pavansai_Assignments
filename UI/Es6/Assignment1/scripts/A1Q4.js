var arr = ["Tom", "Ivan", "jerry"];
var _loop_1 = function (i) {
    document.write("<br>");
    document.write("[{");
    a = function () { return " name: " + i + " length " + i.length; };
    document.write(a() + ",");
};
var a;
for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
    var i = arr_1[_i];
    _loop_1(i);
}
document.write("}]");
//# sourceMappingURL=A1Q4.js.map