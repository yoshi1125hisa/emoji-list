package com.yoshi1125hisa.emoji;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String[] feel = {
            "😄",
            "😃",
            "😀",
            "😊",
            "☺",
            "😉",
            "😍",
            "😘",
            "😚",
            "😗",
            "😙",
            "😜",
            "😝",
            "😛",
            "😳",
            "😁",
            "😔",
            "😌",
            "😒",
            "😞",
            "😣",
            "😢",
            "😂",
            "😭",
            "😪",
            "😥",
            "😰",
            "😅",
            "😓",
            "😩",
            "😫",
            "😨",
            "😱",
            "😠",
            "😡",
            "😤",
            "😖",
            "😆",
            "😋",
            "😷",
            "😎",
            "😴",
            "😵",
            "😲",
            "😟",
            "😦",
            "😧",
            "😈",
            "👿",
            "😮",
            "😬",
            "😐",
            "😕",
            "😯",
            "😶",
            "😇",
            "😏",
            "😑",
            "👲",
            "👳",
            "👮",
            "👷",
            "💂",
            "👶",
            "👦",
            "👧",
            "👨",
            "👩",
            "👴",
            "👵",
            "👱",
            "👼",
            "👸",
            "😺",
            "😸",
            "😻",
            "😽",
            "😼",
            "🙀",
            "😿",
            "😹",
            "😾",
            "👹",
            "👺",
            "🙈",
            "🙉",
            "🙊",
            "💀",
            "👽",
            "💩",
            "🔥",
            "✨",
            "🌟",
            "💫",
            "💥",
            "💢",
            "💦",
            "💧",
            "💤",
            "💨",
            "👂",
            "👀",
            "👃",
            "👅",
            "👄",
            "👍",
            "👎",
            "👌",
            "👊",
            "✊",
            "✌",
            "👋",
            "✋",
            "👐",
            "👆",
            "👇",
            "👉",
            "👈",
            "🙌",
            "🙏",
            "☝",
            "👏",
            "💪",
            "🚶",
            "🏃",
            "💃",
            "👫",
            "👪",
            "👬",
            "👭",
            "💏",
            "💑",
            "👯",
            "🙆",
            "🙅",
            "💁",
            "🙋",
            "💆",
            "💇",
            "💅",
            "👰",
            "🙎",
            "🙍",
            "🙇",
            "🎩",
            "👑",
            "👒",
            "👟",
            "👞",
            "👡",
            "👠",
            "👢",
            "👕",
            "👔",
            "👚",
            "👗",
            "🎽",
            "👖",
            "👘",
            "👙",
            "💼",
            "👜",
            "👝",
            "👛",
            "👓",
            "🎀",
            "🌂",
            "💄",
            "💛",
            "💙",
            "💜",
            "💚",
            "❤",
            "💔",
            "💗",
            "💓",
            "💕",
            "💖",
            "💞",
            "💘",
            "💌",
            "💋",
            "💍",
            "💎",
            "👤",
            "👥",
            "💬",
            "👣",
            "💭"}
            ;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(this);
        setContentView(listView);

        // simple_list_item_1 は、 もともと用意されている定義済みのレイアウトファイルのID
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, feel);
        listView.setAdapter(arrayAdapter);
    }
        }