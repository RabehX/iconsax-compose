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


val Iconsax.Filled.FlashCircle1: ImageVector
    get() {
        if (_FlashCircle1 != null) {
            return _FlashCircle1!!
        }
        _FlashCircle1 = ImageVector.Builder(
            name = "Filled.FlashCircle1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 2f)
                curveTo(6.451f, 2f, 1.971f, 6.48f, 1.971f, 12f)
                curveTo(1.971f, 17.52f, 6.451f, 22f, 11.971f, 22f)
                curveTo(17.491f, 22f, 21.971f, 17.52f, 21.971f, 12f)
                curveTo(21.971f, 6.48f, 17.501f, 2f, 11.971f, 2f)
                close()
                moveTo(15.721f, 12.35f)
                lineTo(12.001f, 16.58f)
                lineTo(11.561f, 17.08f)
                curveTo(10.951f, 17.77f, 10.451f, 17.59f, 10.451f, 16.66f)
                verticalLineTo(12.7f)
                horizontalLineTo(8.751f)
                curveTo(7.981f, 12.7f, 7.771f, 12.23f, 8.281f, 11.65f)
                lineTo(12.001f, 7.42f)
                lineTo(12.441f, 6.92f)
                curveTo(13.051f, 6.23f, 13.551f, 6.41f, 13.551f, 7.34f)
                verticalLineTo(11.3f)
                horizontalLineTo(15.251f)
                curveTo(16.021f, 11.3f, 16.231f, 11.77f, 15.721f, 12.35f)
                close()
            }
        }.build()

        return _FlashCircle1!!
    }

@Suppress("ObjectPropertyName")
private var _FlashCircle1: ImageVector? = null
