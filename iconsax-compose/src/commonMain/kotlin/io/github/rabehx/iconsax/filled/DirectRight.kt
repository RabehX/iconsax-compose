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


val Iconsax.Filled.DirectRight: ImageVector
    get() {
        if (_DirectRight != null) {
            return _DirectRight!!
        }
        _DirectRight = ImageVector.Builder(
            name = "Filled.DirectRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.709f, 17.019f)
                lineTo(4.449f, 13.539f)
                curveTo(4.929f, 12.569f, 4.929f, 11.439f, 4.449f, 10.469f)
                lineTo(2.709f, 6.979f)
                curveTo(1.219f, 3.999f, 4.429f, 0.849f, 7.379f, 2.409f)
                lineTo(8.919f, 3.229f)
                curveTo(9.139f, 3.339f, 9.309f, 3.519f, 9.399f, 3.739f)
                lineTo(15.089f, 16.389f)
                curveTo(15.319f, 16.909f, 15.109f, 17.519f, 14.609f, 17.779f)
                lineTo(7.369f, 21.589f)
                curveTo(4.429f, 23.149f, 1.219f, 19.999f, 2.709f, 17.019f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.309f, 15.6f)
                lineTo(12.579f, 7.32f)
                curveTo(12.159f, 6.39f, 13.159f, 5.45f, 14.059f, 5.93f)
                lineTo(19.829f, 8.97f)
                curveTo(22.279f, 10.26f, 22.279f, 13.76f, 19.829f, 15.05f)
                lineTo(17.789f, 16.12f)
                curveTo(17.239f, 16.4f, 16.569f, 16.17f, 16.309f, 15.6f)
                close()
            }
        }.build()

        return _DirectRight!!
    }

@Suppress("ObjectPropertyName")
private var _DirectRight: ImageVector? = null
