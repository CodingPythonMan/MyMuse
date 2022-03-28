# MyMuse :sparkles:
  + .Net Core MVC 및 API Server를 연습하기 위한 사이트입니다.

# 목적
  + 유튜브 링크 음악을 광고없이 MP3만 나오게 한다.
  + 나만의 재생목록을 쉽게 구현할 수 있다.

# 요구사항 :tornado:
  + 유튜브 링크를 담는 웹사이트
  + 유튜브 링크를 클릭하면 MP3만 가져와서 재생시킬 수 있을까?

# 문서화
  + 모델링 : 재생목록(PlayList), 곡(Song)
    ++ 재생목록 
      +++ 곡(FK)(Song)
      +++ 만든사람(Maker)
      +++ 등록일자(regDate)
