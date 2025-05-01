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


val Iconsax.Filled.HeartEdit: ImageVector
    get() {
        if (_HeartEdit != null) {
            return _HeartEdit!!
        }
        _HeartEdit = ImageVector.Builder(
            name = "Filled.HeartEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.44f, 3.102f)
                curveTo(14.63f, 3.102f, 13.01f, 3.982f, 12f, 5.332f)
                curveTo(10.99f, 3.982f, 9.37f, 3.102f, 7.56f, 3.102f)
                curveTo(4.49f, 3.102f, 2f, 5.602f, 2f, 8.692f)
                curveTo(2f, 9.882f, 2.19f, 10.982f, 2.52f, 12.002f)
                curveTo(4.1f, 17.002f, 8.97f, 19.992f, 11.38f, 20.812f)
                curveTo(11.72f, 20.932f, 12.28f, 20.932f, 12.62f, 20.812f)
                curveTo(15.03f, 19.992f, 19.9f, 17.002f, 21.48f, 12.002f)
                curveTo(21.81f, 10.982f, 22f, 9.882f, 22f, 8.692f)
                curveTo(22f, 5.602f, 19.51f, 3.102f, 16.44f, 3.102f)
                close()
                moveTo(14.84f, 11.382f)
                lineTo(11.3f, 14.922f)
                curveTo(11.16f, 15.062f, 10.9f, 15.192f, 10.71f, 15.222f)
                lineTo(9.36f, 15.402f)
                curveTo(8.87f, 15.472f, 8.53f, 15.132f, 8.6f, 14.642f)
                lineTo(8.79f, 13.292f)
                curveTo(8.82f, 13.102f, 8.95f, 12.832f, 9.09f, 12.702f)
                lineTo(12.63f, 9.162f)
                curveTo(13.24f, 8.552f, 13.95f, 8.262f, 14.85f, 9.162f)
                curveTo(15.74f, 10.062f, 15.45f, 10.772f, 14.84f, 11.382f)
                close()
            }
        }.build()

        return _HeartEdit!!
    }

@Suppress("ObjectPropertyName")
private var _HeartEdit: ImageVector? = null
