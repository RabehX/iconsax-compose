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


val Iconsax.Filled.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Filled.Map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.148f, 7.488f)
                curveTo(8.588f, 7.488f, 8.148f, 7.938f, 8.148f, 8.488f)
                curveTo(8.148f, 9.038f, 8.598f, 9.488f, 9.148f, 9.488f)
                curveTo(9.698f, 9.488f, 10.148f, 9.038f, 10.148f, 8.488f)
                curveTo(10.148f, 7.938f, 9.698f, 7.488f, 9.148f, 7.488f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.46f, 5.04f)
                curveTo(20.62f, 3.09f, 18.77f, 2f, 16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.6f, 2f, 2f, 4.6f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 18.77f, 3.09f, 20.62f, 5.04f, 21.46f)
                curveTo(5.23f, 21.54f, 5.45f, 21.49f, 5.59f, 21.35f)
                lineTo(21.35f, 5.59f)
                curveTo(21.5f, 5.44f, 21.55f, 5.22f, 21.46f, 5.04f)
                close()
                moveTo(10.53f, 12.24f)
                curveTo(10.14f, 12.62f, 9.63f, 12.8f, 9.12f, 12.8f)
                curveTo(8.61f, 12.8f, 8.1f, 12.61f, 7.71f, 12.24f)
                curveTo(6.69f, 11.28f, 5.57f, 9.75f, 6f, 7.93f)
                curveTo(6.38f, 6.28f, 7.84f, 5.54f, 9.12f, 5.54f)
                curveTo(10.4f, 5.54f, 11.86f, 6.28f, 12.24f, 7.94f)
                curveTo(12.66f, 9.75f, 11.54f, 11.28f, 10.53f, 12.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.469f, 20.529f)
                curveTo(19.689f, 20.75f, 19.659f, 21.11f, 19.389f, 21.26f)
                curveTo(18.509f, 21.75f, 17.439f, 22f, 16.189f, 22f)
                horizontalLineTo(7.809f)
                curveTo(7.519f, 22f, 7.399f, 21.66f, 7.599f, 21.459f)
                lineTo(13.639f, 15.42f)
                curveTo(13.839f, 15.219f, 14.149f, 15.219f, 14.349f, 15.42f)
                lineTo(19.469f, 20.529f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.002f, 7.809f)
                verticalLineTo(16.189f)
                curveTo(22.002f, 17.439f, 21.752f, 18.519f, 21.262f, 19.389f)
                curveTo(21.112f, 19.659f, 20.752f, 19.679f, 20.532f, 19.469f)
                lineTo(15.412f, 14.349f)
                curveTo(15.212f, 14.149f, 15.212f, 13.839f, 15.412f, 13.639f)
                lineTo(21.452f, 7.599f)
                curveTo(21.662f, 7.399f, 22.002f, 7.519f, 22.002f, 7.809f)
                close()
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
