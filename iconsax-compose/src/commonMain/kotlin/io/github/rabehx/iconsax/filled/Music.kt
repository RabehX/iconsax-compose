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


val Iconsax.Filled.Music: ImageVector
    get() {
        if (_Music != null) {
            return _Music!!
        }
        _Music = ImageVector.Builder(
            name = "Filled.Music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.889f, 5.179f)
                verticalLineTo(16.479f)
                curveTo(20.889f, 18.459f, 19.279f, 20.069f, 17.299f, 20.069f)
                curveTo(15.329f, 20.069f, 13.709f, 18.459f, 13.709f, 16.479f)
                curveTo(13.709f, 14.509f, 15.329f, 12.899f, 17.299f, 12.899f)
                curveTo(18.139f, 12.899f, 18.889f, 13.189f, 19.499f, 13.669f)
                verticalLineTo(7.719f)
                lineTo(10.289f, 10.339f)
                verticalLineTo(18.409f)
                curveTo(10.289f, 20.389f, 8.669f, 21.999f, 6.699f, 21.999f)
                curveTo(4.719f, 21.999f, 3.109f, 20.389f, 3.109f, 18.409f)
                curveTo(3.109f, 16.439f, 4.719f, 14.829f, 6.699f, 14.829f)
                curveTo(7.529f, 14.829f, 8.279f, 15.119f, 8.889f, 15.589f)
                verticalLineTo(6.749f)
                curveTo(8.889f, 5.279f, 9.779f, 4.139f, 11.189f, 3.759f)
                lineTo(16.969f, 2.179f)
                curveTo(18.139f, 1.859f, 19.129f, 1.969f, 19.829f, 2.509f)
                curveTo(20.539f, 3.039f, 20.889f, 3.939f, 20.889f, 5.179f)
                close()
            }
        }.build()

        return _Music!!
    }

@Suppress("ObjectPropertyName")
private var _Music: ImageVector? = null
