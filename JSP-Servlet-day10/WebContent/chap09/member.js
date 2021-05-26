function loginCheck() {
	if(document.frm.useid.value.length == "") {
		alert("아이디를 입력해 주세요");
		frm.useid.focus();
		return false;
	}
	if(document.frm.pwd.value == "") {
		alert("비밀번호를 입력해 주세요");
		frm.pwd.focus();
		return false;
	}
	return true;
}
function idok(useid) {
	opener.frm.useid.value = document.frm.useid.value;
	opener.frm.reid.value = document.frm.useid.value;
	self.close();
}
function joinCheck() {
	if(document.frm.name.value.length == "") {
		alert("이름을 입력해 주세요");
		frm.name.focus();
		return false;
	}
	if(document.frm.useid.value.length == "") {
		alert("아이디를 입력해 주세요");
		frm.useid.focus();
		return false;
	}
	if(document.frm.useid.value.length < 4) {
		alert("아이디는 4글자 이상이어야 합니다");
		frm.useid.focus();
		return false;
	}
	if(document.frm.pwd.value.length == "") {
		alert("암호를 입력해 주세요");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.pwd.value != document.frm.pwd_check.value) {
		alert("암호가 일치하지 않습니다");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.reid.value.length == "") {
		alert("중복 체크를 하지 않았습니다.");
		frm.useid.focus();
		return false;
	}
	return true;
}
function idCheck() {
	if(document.frm.useid.value == "") {
		alert("아이디를 입력해 주세요");
		document.formm.useid.focus();
		return;
	}
	var url = "idCheck.do?useid="+ document.frm.useid.value;
	window.open(url,"_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no,width=450,height=200");
}