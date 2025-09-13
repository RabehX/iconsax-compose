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


val Iconsax.Filled.PercentageSquare: ImageVector
    get() {
        if (_PercentageSquare != null) {
            return _PercentageSquare!!
        }
        _PercentageSquare = ImageVector.Builder(
            name = "Filled.PercentageSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(7.75f, 9.14f)
                curveTo(7.75f, 8.33f, 8.41f, 7.66f, 9.23f, 7.66f)
                curveTo(10.04f, 7.66f, 10.71f, 8.32f, 10.71f, 9.14f)
                curveTo(10.71f, 9.95f, 10.05f, 10.62f, 9.23f, 10.62f)
                curveTo(8.41f, 10.61f, 7.75f, 9.95f, 7.75f, 9.14f)
                close()
                moveTo(8.82f, 16.02f)
                curveTo(8.63f, 16.02f, 8.44f, 15.95f, 8.29f, 15.8f)
                curveTo(8f, 15.51f, 8f, 15.04f, 8.29f, 14.74f)
                lineTo(14.84f, 8.19f)
                curveTo(15.13f, 7.9f, 15.61f, 7.9f, 15.9f, 8.19f)
                curveTo(16.19f, 8.48f, 16.19f, 8.96f, 15.9f, 9.25f)
                lineTo(9.35f, 15.8f)
                curveTo(9.2f, 15.95f, 9.01f, 16.02f, 8.82f, 16.02f)
                close()
                moveTo(15.77f, 16.34f)
                curveTo(14.96f, 16.34f, 14.29f, 15.68f, 14.29f, 14.86f)
                curveTo(14.29f, 14.05f, 14.95f, 13.38f, 15.77f, 13.38f)
                curveTo(16.58f, 13.38f, 17.25f, 14.04f, 17.25f, 14.86f)
                curveTo(17.25f, 15.68f, 16.59f, 16.34f, 15.77f, 16.34f)
                close()
            }
        }.build()

        return _PercentageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PercentageSquare: ImageVector? = null
