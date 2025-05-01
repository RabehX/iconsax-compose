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


val Iconsax.Filled.TagRight: ImageVector
    get() {
        if (_TagRight != null) {
            return _TagRight!!
        }
        _TagRight = ImageVector.Builder(
            name = "Filled.TagRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.88f, 6.122f)
                lineTo(3.92f, 20.082f)
                curveTo(3.49f, 20.512f, 2.77f, 20.472f, 2.42f, 19.982f)
                curveTo(1.92f, 19.292f, 1.82f, 18.332f, 2.34f, 17.502f)
                lineTo(5.1f, 13.072f)
                curveTo(5.47f, 12.482f, 5.47f, 11.522f, 5.1f, 10.932f)
                lineTo(2.34f, 6.502f)
                curveTo(1.41f, 5.022f, 2.48f, 3.102f, 4.22f, 3.102f)
                horizontalLineTo(15.67f)
                curveTo(16.35f, 3.102f, 17.19f, 3.572f, 17.55f, 4.142f)
                lineTo(18.02f, 4.882f)
                curveTo(18.26f, 5.282f, 18.21f, 5.792f, 17.88f, 6.122f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.63f, 13.112f)
                lineTo(16.45f, 20.012f)
                curveTo(16.09f, 20.502f, 15.29f, 20.902f, 14.67f, 20.902f)
                horizontalLineTo(7.51f)
                curveTo(6.62f, 20.902f, 6.17f, 19.822f, 6.8f, 19.192f)
                lineTo(18.32f, 7.682f)
                curveTo(18.77f, 7.232f, 19.54f, 7.312f, 19.88f, 7.862f)
                lineTo(21.73f, 10.832f)
                curveTo(22.13f, 11.472f, 22.09f, 12.502f, 21.63f, 13.112f)
                close()
            }
        }.build()

        return _TagRight!!
    }

@Suppress("ObjectPropertyName")
private var _TagRight: ImageVector? = null
