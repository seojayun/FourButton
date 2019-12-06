package com.example.fourbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
                                                                     //OnClickListener 추상메소드필요
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnNaver, btn119, btnGal, btnEnd;
   //버튼 변수 선언
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("네가지 버튼 기능");
        btnNaver=(Button)findViewById(R.id.btnNaver);
        btn119=(Button)findViewById(R.id.btn119);
        btnGal=(Button)findViewById(R.id.btnGallery);
        btnEnd=(Button)findViewById(R.id.btnEnd);

        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                       Intent mintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                        startActivity(mintent);
            }
        });
        btn119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     Intent mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/119"));
                      startActivity(mintent);
            }
        });
        btnGal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent mintent=new Intent();
                        mintent.setAction(Intent.ACTION_GET_CONTENT);
                        mintent.setType("image/*");
                        startActivityForResult(mintent,0);
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


                // 내부클래스 사용
                // btnNaver.setOnClickListener(new MyListener);
                // btn119.setOnClickListener(new MyListener);
                // btnGal.setOnClickListener(new MyListener);
                // btnEnd.setOnClickListener((new MyListener));

                // 연결해놔야 실행 가능 엑티비티 구현
//        btnNaver.setOnClickListener(this);
//        btn119.setOnClickListener(this);
//        btnGal.setOnClickListener(this);
//        btnEnd.setOnClickListener(this);


                //btnGal.setText("갤러리 사진보기");
                //btnGal.setBackgroundColor(Color.YELLOW);
                //btnEnd.setBackgroundColor(Color.rgb(0,0,255));
                //btnEnd.setBackgroundColor((Color.rgb(255,255,255)));
                //btnNaver.setOnClickListener(new View.OnClickListener() {
                // @Override
                //    public void onClick(View v) {
                //        Intent mintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                //        startActivity(mintent);
                //    }

//        });
                //      btn119.setOnClickListener(new View.OnClickListener() {
                //  @Override
                //  public void onClick(View v) {
                //      Intent mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/119"));
                //      startActivity(mintent);
                //    }
                //    });
                //btnGal.setOnClickListener(new View.OnClickListener() {
                //    @Override
                //    public void onClick(View v) {
                //        Intent mintent=new Intent();
                //        mintent.setAction(Intent.ACTION_GET_CONTENT);
                //        mintent.setType("image/*");
                //        startActivityForResult(mintent,0);
                //    }
                //});
                //btnEnd.setOnClickListener(new View.OnClickListener() {
                //   @Override
                //   public void onClick(View v) {
                //       finish();
                //    }
                // });


                //내부클래스 이용방법  -결과는 똑같이 나온다.


//    }
//    class MyListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View v) {
//            Intent mintent;
//            switch (v.getId()) {
//                case R.id.btnNaver:
//                    mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/119"));
//                        startActivity(mintent);
//                        //암시적 Intent
//                    break;
//                case R.id.btn119:
//                    mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/119"));
//                          startActivity(mintent);
//                    break;
//                case R.id.btnGallery:
//                           mintent=new Intent();
//                            mintent.setAction(Intent.ACTION_GET_CONTENT);
//                          mintent.setType("image/*");
//                         startActivityForResult(mintent,0);
//                    break;
//                case R.id.btnEnd:
//                    finish();
//                    break;
//            }
//
//        }
//
                //엑티비티에 인터페이스를 직접 구현하는 방법


                //   }

//    @Override
//    public void onClick(View v) {
//                    Intent mintent;
//            switch (v.getId()) {
//                case R.id.btnNaver:
//                    mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/119"));
//                        startActivity(mintent);
//                        //암시적 Intent
//                    break;
//                case R.id.btn119:
//                    mintent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/119"));
//                          startActivity(mintent);
//                    break;
//                case R.id.btnGallery:
//                           mintent=new Intent();
//                            mintent.setAction(Intent.ACTION_GET_CONTENT);
//                          mintent.setType("image/*");
//                         startActivityForResult(mintent,0);
//                    break;
//                case R.id.btnEnd:
//                    finish();
//                    break;
//
//    }

    }

                                                                         @Override
                                                                         public void onClick(View v) {
                                                                             
                                                                         }
                                                                     }