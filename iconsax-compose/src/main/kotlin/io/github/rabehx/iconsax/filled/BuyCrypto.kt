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


val Iconsax.Filled.BuyCrypto: ImageVector
    get() {
        if (_BuyCrypto != null) {
            return _BuyCrypto!!
        }
        _BuyCrypto = ImageVector.Builder(
            name = "Filled.BuyCrypto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.5f)
                curveTo(22f, 11.76f, 19.6f, 14.45f, 16.48f, 14.92f)
                verticalLineTo(14.86f)
                curveTo(16.17f, 10.98f, 13.02f, 7.83f, 9.11f, 7.52f)
                horizontalLineTo(9.08f)
                curveTo(9.55f, 4.4f, 12.24f, 2f, 15.5f, 2f)
                curveTo(19.09f, 2f, 22f, 4.91f, 22f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.98f, 14.98f)
                curveTo(14.73f, 11.81f, 12.19f, 9.27f, 9.02f, 9.02f)
                curveTo(8.85f, 9.01f, 8.67f, 9f, 8.5f, 9f)
                curveTo(4.91f, 9f, 2f, 11.91f, 2f, 15.5f)
                curveTo(2f, 19.09f, 4.91f, 22f, 8.5f, 22f)
                curveTo(12.09f, 22f, 15f, 19.09f, 15f, 15.5f)
                curveTo(15f, 15.33f, 14.99f, 15.15f, 14.98f, 14.98f)
                close()
                moveTo(9.38f, 16.38f)
                lineTo(8.5f, 18f)
                lineTo(7.62f, 16.38f)
                lineTo(6f, 15.5f)
                lineTo(7.62f, 14.62f)
                lineTo(8.5f, 13f)
                lineTo(9.38f, 14.62f)
                lineTo(11f, 15.5f)
                lineTo(9.38f, 16.38f)
                close()
            }
        }.build()

        return _BuyCrypto!!
    }

@Suppress("ObjectPropertyName")
private var _BuyCrypto: ImageVector? = null
