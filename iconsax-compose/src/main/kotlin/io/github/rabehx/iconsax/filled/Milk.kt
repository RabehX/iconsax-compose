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


val Iconsax.Filled.Milk: ImageVector
    get() {
        if (_Milk != null) {
            return _Milk!!
        }
        _Milk = ImageVector.Builder(
            name = "Filled.Milk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.998f)
                verticalLineTo(18.998f)
                curveTo(18f, 20.648f, 16.65f, 21.998f, 15f, 21.998f)
                horizontalLineTo(9f)
                curveTo(7.35f, 21.998f, 6f, 20.648f, 6f, 18.998f)
                verticalLineTo(14.988f)
                curveTo(6f, 14.438f, 6.45f, 13.988f, 7.01f, 13.988f)
                lineTo(9.89f, 13.998f)
                curveTo(10.58f, 13.998f, 11.26f, 14.148f, 11.89f, 14.448f)
                curveTo(12.58f, 14.768f, 13.31f, 14.998f, 14.08f, 14.998f)
                horizontalLineTo(17f)
                curveTo(17.55f, 14.998f, 18f, 15.448f, 18f, 15.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.41f, 9.41f)
                lineTo(15.29f, 7.29f)
                curveTo(15.1f, 7.1f, 15f, 6.85f, 15f, 6.59f)
                verticalLineTo(4.91f)
                curveTo(15.58f, 4.71f, 16f, 4.15f, 16f, 3.5f)
                curveTo(16f, 2.67f, 15.33f, 2f, 14.5f, 2f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 2f, 8f, 2.67f, 8f, 3.5f)
                curveTo(8f, 4.15f, 8.42f, 4.71f, 9f, 4.91f)
                verticalLineTo(6.59f)
                curveTo(9f, 6.85f, 8.9f, 7.1f, 8.71f, 7.29f)
                lineTo(6.59f, 9.41f)
                curveTo(6.27f, 9.73f, 6f, 10.38f, 6f, 10.83f)
                verticalLineTo(11.48f)
                curveTo(6f, 12.03f, 6.44f, 12.48f, 6.99f, 12.48f)
                lineTo(9.9f, 12.5f)
                curveTo(10.88f, 12.5f, 11.87f, 12.74f, 12.75f, 13.2f)
                curveTo(13.17f, 13.42f, 13.65f, 13.5f, 14.12f, 13.5f)
                horizontalLineTo(17f)
                curveTo(17.55f, 13.5f, 18f, 13.05f, 18f, 12.5f)
                verticalLineTo(10.83f)
                curveTo(18f, 10.38f, 17.73f, 9.73f, 17.41f, 9.41f)
                close()
            }
        }.build()

        return _Milk!!
    }

@Suppress("ObjectPropertyName")
private var _Milk: ImageVector? = null
