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


val Iconsax.Filled.Glass: ImageVector
    get() {
        if (_Glass != null) {
            return _Glass!!
        }
        _Glass = ImageVector.Builder(
            name = "Filled.Glass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.841f, 21.998f)
                horizontalLineTo(8.161f)
                curveTo(3.971f, 21.998f, 3.141f, 19.468f, 4.501f, 16.388f)
                lineTo(5.941f, 13.118f)
                curveTo(5.941f, 13.118f, 9.001f, 12.998f, 12.001f, 13.998f)
                curveTo(15.001f, 14.998f, 17.831f, 13.108f, 17.831f, 13.108f)
                lineTo(18.021f, 12.988f)
                lineTo(19.511f, 16.398f)
                curveTo(20.851f, 19.478f, 19.971f, 21.998f, 15.841f, 21.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.44f, 6.74f)
                horizontalLineTo(15.28f)
                lineTo(17.41f, 11.6f)
                lineTo(17f, 11.86f)
                curveTo(16.98f, 11.87f, 14.72f, 13.32f, 12.47f, 12.58f)
                curveTo(10.12f, 11.79f, 7.76f, 11.65f, 6.6f, 11.63f)
                lineTo(8.74f, 6.74f)
                horizontalLineTo(8.44f)
                curveTo(7.79f, 6.74f, 7.19f, 6.48f, 6.76f, 6.05f)
                curveTo(6.33f, 5.62f, 6.07f, 5.02f, 6.07f, 4.37f)
                curveTo(6.07f, 3.07f, 7.13f, 2f, 8.44f, 2f)
                horizontalLineTo(15.55f)
                curveTo(16.21f, 2f, 16.8f, 2.27f, 17.23f, 2.7f)
                curveTo(17.79f, 3.26f, 18.08f, 4.08f, 17.86f, 4.95f)
                curveTo(17.6f, 6.03f, 16.56f, 6.74f, 15.44f, 6.74f)
                close()
            }
        }.build()

        return _Glass!!
    }

@Suppress("ObjectPropertyName")
private var _Glass: ImageVector? = null
