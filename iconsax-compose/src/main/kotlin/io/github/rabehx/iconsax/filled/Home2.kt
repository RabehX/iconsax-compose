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


val Iconsax.Filled.Home2: ImageVector
    get() {
        if (_Home2 != null) {
            return _Home2!!
        }
        _Home2 = ImageVector.Builder(
            name = "Filled.Home2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.04f, 6.822f)
                lineTo(14.28f, 2.792f)
                curveTo(12.71f, 1.692f, 10.3f, 1.752f, 8.79f, 2.922f)
                lineTo(3.78f, 6.832f)
                curveTo(2.78f, 7.612f, 1.99f, 9.212f, 1.99f, 10.472f)
                verticalLineTo(17.372f)
                curveTo(1.99f, 19.922f, 4.06f, 22.002f, 6.61f, 22.002f)
                horizontalLineTo(17.39f)
                curveTo(19.94f, 22.002f, 22.01f, 19.932f, 22.01f, 17.382f)
                verticalLineTo(10.602f)
                curveTo(22.01f, 9.252f, 21.14f, 7.592f, 20.04f, 6.822f)
                close()
                moveTo(12.75f, 18.002f)
                curveTo(12.75f, 18.412f, 12.41f, 18.752f, 12f, 18.752f)
                curveTo(11.59f, 18.752f, 11.25f, 18.412f, 11.25f, 18.002f)
                verticalLineTo(15.002f)
                curveTo(11.25f, 14.592f, 11.59f, 14.252f, 12f, 14.252f)
                curveTo(12.41f, 14.252f, 12.75f, 14.592f, 12.75f, 15.002f)
                verticalLineTo(18.002f)
                close()
            }
        }.build()

        return _Home2!!
    }

@Suppress("ObjectPropertyName")
private var _Home2: ImageVector? = null
