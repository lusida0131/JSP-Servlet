/**
 * params.js : 입력 파라미터 유효성 검사
 */
// 정규식을 사용해서 어떤 입력 형식을 따르는지 유효성 검사를 수행 -> 나중에
function check() {
	if(document.frm.id.value == "") {
		alert("아이디를 입력해 주세요.");
		document.frm.id.focus();
		return false;
	} else if(document.frm.age.value =="") { 
		alert("나이를 입력해 주세요.");
		document.frm.age.focus(); //커서를 움직인다
		return false;
	} else if(isNaN(document.frm.age.value)) { //NaN = not a number
		alert("숫자로 입력해 주세요.");
		document.frm.age.focus();
		return false;
	} else{
		return true;
	}
}