/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.EmojiSad: ImageVector
    get() {
        if (_EmojiSad != null) {
            return _EmojiSad!!
        }
        _EmojiSad = ImageVector.Builder(
            name = "Outline.EmojiSad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.639f, 9.5f)
                curveTo(10.45f, 9.5f, 10.259f, 9.43f, 10.109f, 9.28f)
                curveTo(9.399f, 8.57f, 8.239f, 8.57f, 7.529f, 9.28f)
                curveTo(7.239f, 9.57f, 6.759f, 9.57f, 6.469f, 9.28f)
                curveTo(6.179f, 8.99f, 6.179f, 8.51f, 6.469f, 8.22f)
                curveTo(7.759f, 6.93f, 9.869f, 6.93f, 11.17f, 8.22f)
                curveTo(11.46f, 8.51f, 11.46f, 8.99f, 11.17f, 9.28f)
                curveTo(11.019f, 9.43f, 10.83f, 9.5f, 10.639f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.361f, 9.5f)
                curveTo(13.171f, 9.5f, 12.981f, 9.43f, 12.831f, 9.28f)
                curveTo(12.541f, 8.99f, 12.541f, 8.51f, 12.831f, 8.22f)
                curveTo(14.121f, 6.93f, 16.231f, 6.93f, 17.531f, 8.22f)
                curveTo(17.821f, 8.51f, 17.821f, 8.99f, 17.531f, 9.28f)
                curveTo(17.241f, 9.57f, 16.761f, 9.57f, 16.471f, 9.28f)
                curveTo(15.761f, 8.57f, 14.601f, 8.57f, 13.891f, 9.28f)
                curveTo(13.751f, 9.43f, 13.561f, 9.5f, 13.361f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.6f, 18.45f)
                horizontalLineTo(8.4f)
                curveTo(7.49f, 18.45f, 6.75f, 17.71f, 6.75f, 16.8f)
                curveTo(6.75f, 13.91f, 9.1f, 11.55f, 12f, 11.55f)
                curveTo(14.9f, 11.55f, 17.25f, 13.91f, 17.25f, 16.8f)
                curveTo(17.25f, 17.71f, 16.51f, 18.45f, 15.6f, 18.45f)
                close()
                moveTo(12f, 13.05f)
                curveTo(9.93f, 13.05f, 8.25f, 14.73f, 8.25f, 16.8f)
                curveTo(8.25f, 16.88f, 8.32f, 16.95f, 8.4f, 16.95f)
                horizontalLineTo(15.6f)
                curveTo(15.68f, 16.95f, 15.75f, 16.88f, 15.75f, 16.8f)
                curveTo(15.75f, 14.73f, 14.07f, 13.05f, 12f, 13.05f)
                close()
            }
        }.build()

        return _EmojiSad!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiSad: ImageVector? = null
