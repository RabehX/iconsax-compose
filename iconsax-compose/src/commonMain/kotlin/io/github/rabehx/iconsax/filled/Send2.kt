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


val Iconsax.Filled.Send2: ImageVector
    get() {
        if (_Send2 != null) {
            return _Send2!!
        }
        _Send2 = ImageVector.Builder(
            name = "Filled.Send2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.139f, 2.959f)
                lineTo(7.109f, 5.959f)
                curveTo(1.039f, 7.989f, 1.039f, 11.299f, 7.109f, 13.319f)
                lineTo(9.789f, 14.209f)
                lineTo(10.679f, 16.889f)
                curveTo(12.699f, 22.959f, 16.019f, 22.959f, 18.039f, 16.889f)
                lineTo(21.049f, 7.869f)
                curveTo(22.389f, 3.819f, 20.189f, 1.609f, 16.139f, 2.959f)
                close()
                moveTo(16.459f, 8.339f)
                lineTo(12.659f, 12.159f)
                curveTo(12.509f, 12.309f, 12.319f, 12.379f, 12.129f, 12.379f)
                curveTo(11.939f, 12.379f, 11.749f, 12.309f, 11.599f, 12.159f)
                curveTo(11.309f, 11.869f, 11.309f, 11.389f, 11.599f, 11.099f)
                lineTo(15.399f, 7.279f)
                curveTo(15.689f, 6.989f, 16.169f, 6.989f, 16.459f, 7.279f)
                curveTo(16.749f, 7.569f, 16.749f, 8.049f, 16.459f, 8.339f)
                close()
            }
        }.build()

        return _Send2!!
    }

@Suppress("ObjectPropertyName")
private var _Send2: ImageVector? = null
