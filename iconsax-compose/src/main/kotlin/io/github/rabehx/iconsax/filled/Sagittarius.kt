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


val Iconsax.Filled.Sagittarius: ImageVector
    get() {
        if (_Sagittarius != null) {
            return _Sagittarius!!
        }
        _Sagittarius = ImageVector.Builder(
            name = "Filled.Sagittarius",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.69f, 2.71f)
                curveTo(21.61f, 2.53f, 21.469f, 2.38f, 21.279f, 2.3f)
                curveTo(21.19f, 2.27f, 21.1f, 2.25f, 21f, 2.25f)
                horizontalLineTo(12f)
                curveTo(11.59f, 2.25f, 11.25f, 2.59f, 11.25f, 3f)
                curveTo(11.25f, 3.41f, 11.59f, 3.75f, 12f, 3.75f)
                horizontalLineTo(19.19f)
                lineTo(2.469f, 20.47f)
                curveTo(2.179f, 20.76f, 2.179f, 21.24f, 2.469f, 21.53f)
                curveTo(2.619f, 21.68f, 2.809f, 21.75f, 2.999f, 21.75f)
                curveTo(3.189f, 21.75f, 3.379f, 21.68f, 3.529f, 21.53f)
                lineTo(20.25f, 4.81f)
                verticalLineTo(12f)
                curveTo(20.25f, 12.41f, 20.59f, 12.75f, 21f, 12.75f)
                curveTo(21.41f, 12.75f, 21.75f, 12.41f, 21.75f, 12f)
                verticalLineTo(3f)
                curveTo(21.75f, 2.9f, 21.729f, 2.81f, 21.69f, 2.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.399f, 18.149f)
                curveTo(17.209f, 18.149f, 17.019f, 18.079f, 16.869f, 17.929f)
                lineTo(6.069f, 7.129f)
                curveTo(5.779f, 6.839f, 5.779f, 6.359f, 6.069f, 6.069f)
                curveTo(6.359f, 5.779f, 6.839f, 5.779f, 7.129f, 6.069f)
                lineTo(17.929f, 16.869f)
                curveTo(18.219f, 17.159f, 18.219f, 17.639f, 17.929f, 17.929f)
                curveTo(17.779f, 18.079f, 17.589f, 18.149f, 17.399f, 18.149f)
                close()
            }
        }.build()

        return _Sagittarius!!
    }

@Suppress("ObjectPropertyName")
private var _Sagittarius: ImageVector? = null
