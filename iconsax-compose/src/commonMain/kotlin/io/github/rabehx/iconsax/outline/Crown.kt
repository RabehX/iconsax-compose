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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Crown: ImageVector
    get() {
        if (_Crown != null) {
            return _Crown!!
        }
        _Crown = ImageVector.Builder(
            name = "Outline.Crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.04f)
                horizontalLineTo(7f)
                curveTo(3.83f, 21.04f, 1.25f, 18.46f, 1.25f, 15.29f)
                verticalLineTo(5.71f)
                curveTo(1.25f, 4.41f, 1.85f, 3.96f, 2.21f, 3.81f)
                curveTo(2.57f, 3.66f, 3.31f, 3.55f, 4.23f, 4.47f)
                lineTo(6.82f, 7.06f)
                curveTo(6.92f, 7.16f, 7.08f, 7.16f, 7.17f, 7.06f)
                lineTo(10.76f, 3.47f)
                curveTo(11.42f, 2.81f, 12.58f, 2.81f, 13.23f, 3.47f)
                lineTo(16.82f, 7.06f)
                curveTo(16.92f, 7.16f, 17.08f, 7.16f, 17.17f, 7.06f)
                lineTo(19.76f, 4.47f)
                curveTo(20.68f, 3.55f, 21.42f, 3.67f, 21.78f, 3.81f)
                curveTo(22.14f, 3.96f, 22.74f, 4.4f, 22.74f, 5.71f)
                verticalLineTo(15.3f)
                curveTo(22.75f, 18.73f, 20.44f, 21.04f, 17f, 21.04f)
                close()
                moveTo(2.81f, 5.24f)
                curveTo(2.78f, 5.32f, 2.75f, 5.47f, 2.75f, 5.71f)
                verticalLineTo(15.3f)
                curveTo(2.75f, 17.64f, 4.66f, 19.55f, 7f, 19.55f)
                horizontalLineTo(17f)
                curveTo(19.58f, 19.55f, 21.25f, 17.88f, 21.25f, 15.3f)
                verticalLineTo(5.71f)
                curveTo(21.25f, 5.47f, 21.22f, 5.33f, 21.19f, 5.25f)
                curveTo(21.11f, 5.29f, 20.99f, 5.37f, 20.82f, 5.54f)
                lineTo(18.23f, 8.13f)
                curveTo(17.57f, 8.79f, 16.41f, 8.79f, 15.76f, 8.13f)
                lineTo(12.17f, 4.54f)
                curveTo(12.07f, 4.44f, 11.91f, 4.44f, 11.82f, 4.54f)
                lineTo(8.24f, 8.12f)
                curveTo(7.58f, 8.78f, 6.42f, 8.78f, 5.77f, 8.12f)
                lineTo(3.18f, 5.53f)
                curveTo(3.01f, 5.36f, 2.88f, 5.28f, 2.81f, 5.24f)
                close()
            }
        }.build()

        return _Crown!!
    }

@Suppress("ObjectPropertyName")
private var _Crown: ImageVector? = null
