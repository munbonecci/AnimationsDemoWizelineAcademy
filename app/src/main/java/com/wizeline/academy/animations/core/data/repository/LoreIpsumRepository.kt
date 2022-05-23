package com.wizeline.academy.animations.core.data.repository

import javax.inject.Inject

class LoreIpsumRepository @Inject constructor() {

    fun getTitle(index: Int): String = createMockedTitle(index)

    private fun createMockedTitle(index: Int): String = when (index) {
        0 -> "Nulla at lectus eu felis ornare porttitor eu eu felis."
        1 -> "Vestibulum at metus accumsan, venenatis velit sit amet, luctus metu."
        2 -> "Aenean rhoncus ipsum ac ipsum consectetur mattis eget ac urna."
        3 -> "Sed tincidunt dui at erat pharetra laoreet."
        4 -> "Proin consectetur ante vel ex pulvinar, eu hendrerit enim tristique."
        else -> ""
    }

    fun getContent(index: Int): String = createMockedContent(index)

    private fun createMockedContent(index: Int): String = when (index) {
        0 -> "In hac habitasse platea dictumst. Donec sit amet aliquet diam. Maecenas varius tempor ultrices. Donec quis varius arcu, quis efficitur dolor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam urna elit, ornare a auctor et, efficitur porttitor felis. Phasellus maximus risus in accumsan aliquet. Sed enim purus, tincidunt a nulla sit amet, fermentum gravida eros. Vestibulum vitae egestas massa. Vestibulum eros neque, dictum non tempor blandit, scelerisque ac dolor."
        1 -> "Nunc vehicula luctus dolor vel congue. Sed convallis volutpat lectus eu pellentesque. Ut ac bibendum nisl, ut pellentesque dolor. Phasellus imperdiet lectus magna, ut accumsan urna pulvinar nec. Nulla in accumsan odio, non molestie libero. Duis consectetur lacinia tortor, a bibendum sem tristique at. Aliquam eleifend ac erat nec fermentum. Donec finibus, enim non ultrices mattis, sem dui pharetra velit, non feugiat diam dolor sit amet libero. Proin sed mattis turpis, eget mollis mauris. Pellentesque ut facilisis erat. Nunc lorem dui, tempus porta viverra nec, dictum vel neque."
        2 -> "Praesent pharetra rutrum nunc, vel ultrices quam sollicitudin eu. Aliquam ultricies est aliquet metus auctor pulvinar. In nec leo porttitor, pellentesque ex eu, auctor libero. Nam commodo lectus est, pellentesque facilisis justo varius nec. Curabitur vel sodales nisi, vitae malesuada quam. Morbi a varius ante. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Maecenas leo odio, iaculis nec eleifend id, maximus efficitur dolor. Pellentesque malesuada semper nulla. Proin fermentum scelerisque commodo. Sed quis sem sed quam luctus convallis ac nec nisl. Duis mollis dui vulputate nulla fringilla sollicitudin. Ut sodales ligula quam, id mattis nunc iaculis in. Proin porttitor congue commodo. Donec at sem et felis hendrerit elementum."
        3 -> "Donec lacinia mi a commodo porttitor. Curabitur venenatis felis ex, eu ultrices lectus bibendum id. In sit amet justo neque. Morbi volutpat ac tortor vitae gravida. Praesent odio dui, elementum id viverra sit amet, tempor vel nulla. Praesent sed pharetra est. Etiam in vestibulum lorem, in consectetur justo."
        4 -> "Nulla venenatis lacus vel turpis fringilla finibus. Donec euismod feugiat tincidunt. Donec ullamcorper feugiat ipsum in egestas. Aliquam varius nibh nec euismod pretium. Praesent ipsum nunc, ullamcorper vitae ligula non, interdum efficitur ipsum. Sed sagittis nulla id nisi euismod, vel aliquam metus efficitur. Pellentesque suscipit in nisi eu pulvinar. Maecenas tristique faucibus mi quis posuere. Maecenas ornare mi id aliquet cursus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Morbi commodo efficitur suscipit. Ut interdum mi a justo tincidunt, eget tincidunt mi dictum."
        else -> ""
    }
}