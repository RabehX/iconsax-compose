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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Cards: ImageVector
    get() {
        if (_Cards != null) {
            return _Cards!!
        }
        _Cards = ImageVector.Builder(
            name = "Filled.Cards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.22f, 6.551f)
                horizontalLineTo(5.78f)
                curveTo(5.5f, 6.551f, 5.24f, 6.561f, 5f, 6.571f)
                curveTo(2.63f, 6.711f, 2f, 7.581f, 2f, 10.281f)
                verticalLineTo(10.861f)
                curveTo(2f, 11.411f, 2.45f, 11.861f, 3f, 11.861f)
                horizontalLineTo(18f)
                curveTo(18.55f, 11.861f, 19f, 11.411f, 19f, 10.861f)
                verticalLineTo(10.281f)
                curveTo(19f, 7.301f, 18.24f, 6.551f, 15.22f, 6.551f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 13.359f)
                curveTo(2.45f, 13.359f, 2f, 13.809f, 2f, 14.359f)
                verticalLineTo(17.269f)
                curveTo(2f, 20.249f, 2.76f, 20.999f, 5.78f, 20.999f)
                horizontalLineTo(15.22f)
                curveTo(18.19f, 20.999f, 18.97f, 20.279f, 19f, 17.429f)
                verticalLineTo(14.359f)
                curveTo(19f, 13.809f, 18.55f, 13.359f, 18f, 13.359f)
                horizontalLineTo(3f)
                close()
                moveTo(6.96f, 18.559f)
                horizontalLineTo(5.25f)
                curveTo(4.84f, 18.559f, 4.5f, 18.219f, 4.5f, 17.809f)
                curveTo(4.5f, 17.399f, 4.84f, 17.059f, 5.25f, 17.059f)
                horizontalLineTo(6.97f)
                curveTo(7.38f, 17.059f, 7.72f, 17.399f, 7.72f, 17.809f)
                curveTo(7.72f, 18.219f, 7.38f, 18.559f, 6.96f, 18.559f)
                close()
                moveTo(12.55f, 18.559f)
                horizontalLineTo(9.11f)
                curveTo(8.7f, 18.559f, 8.36f, 18.219f, 8.36f, 17.809f)
                curveTo(8.36f, 17.399f, 8.7f, 17.059f, 9.11f, 17.059f)
                horizontalLineTo(12.55f)
                curveTo(12.96f, 17.059f, 13.3f, 17.399f, 13.3f, 17.809f)
                curveTo(13.3f, 18.219f, 12.97f, 18.559f, 12.55f, 18.559f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.002f, 13.332f)
                verticalLineTo(8.092f)
                curveTo(22.002f, 4.962f, 20.212f, 3.602f, 17.512f, 3.602f)
                horizontalLineTo(8.582f)
                curveTo(7.822f, 3.602f, 7.142f, 3.712f, 6.542f, 3.942f)
                curveTo(6.072f, 4.112f, 5.652f, 4.362f, 5.312f, 4.692f)
                curveTo(5.132f, 4.862f, 5.272f, 5.142f, 5.532f, 5.142f)
                horizontalLineTo(16.402f)
                curveTo(18.652f, 5.142f, 20.472f, 6.962f, 20.472f, 9.212f)
                verticalLineTo(16.382f)
                curveTo(20.472f, 16.632f, 20.742f, 16.772f, 20.922f, 16.592f)
                curveTo(21.612f, 15.862f, 22.002f, 14.792f, 22.002f, 13.332f)
                close()
            }
        }.build()

        return _Cards!!
    }

@Suppress("ObjectPropertyName")
private var _Cards: ImageVector? = null
