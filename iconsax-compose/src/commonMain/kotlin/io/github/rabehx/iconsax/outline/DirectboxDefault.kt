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

val Iconsax.Outline.DirectboxDefault: ImageVector
    get() {
        if (_DirectboxDefault != null) {
            return _DirectboxDefault!!
        }
        _DirectboxDefault = ImageVector.Builder(
            name = "Outline.DirectboxDefault",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(2.25f, 22.75f, 2.25f, 19.7f, 2.25f, 17f)
                verticalLineTo(16f)
                curveTo(2.25f, 13.77f, 2.25f, 11.25f, 7f, 11.25f)
                curveTo(8.19f, 11.25f, 8.63f, 11.54f, 9.25f, 12f)
                curveTo(9.28f, 12.03f, 9.32f, 12.05f, 9.35f, 12.09f)
                lineTo(10.37f, 13.17f)
                curveTo(11.23f, 14.08f, 12.79f, 14.08f, 13.65f, 13.17f)
                lineTo(14.67f, 12.09f)
                curveTo(14.7f, 12.06f, 14.73f, 12.03f, 14.77f, 12f)
                curveTo(15.39f, 11.53f, 15.83f, 11.25f, 17.02f, 11.25f)
                curveTo(21.77f, 11.25f, 21.77f, 13.77f, 21.77f, 16f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.82f, 19.82f, 22.75f, 16f, 22.75f)
                close()
                moveTo(7f, 12.75f)
                curveTo(3.75f, 12.75f, 3.75f, 13.77f, 3.75f, 16f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.74f, 3.75f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.98f, 21.25f, 20.25f, 19.98f, 20.25f, 17f)
                verticalLineTo(16f)
                curveTo(20.25f, 13.77f, 20.25f, 12.75f, 17f, 12.75f)
                curveTo(16.28f, 12.75f, 16.13f, 12.84f, 15.7f, 13.16f)
                lineTo(14.73f, 14.19f)
                curveTo(14.01f, 14.95f, 13.04f, 15.37f, 12f, 15.37f)
                curveTo(10.96f, 15.37f, 9.99f, 14.95f, 9.27f, 14.19f)
                lineTo(8.3f, 13.16f)
                curveTo(7.87f, 12.84f, 7.72f, 12.75f, 7f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 12.75f)
                curveTo(18.59f, 12.75f, 18.25f, 12.41f, 18.25f, 12f)
                verticalLineTo(6f)
                curveTo(18.25f, 3.77f, 18.25f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(5.75f, 2.75f, 5.75f, 3.77f, 5.75f, 6f)
                verticalLineTo(12f)
                curveTo(5.75f, 12.41f, 5.41f, 12.75f, 5f, 12.75f)
                curveTo(4.59f, 12.75f, 4.25f, 12.41f, 4.25f, 12f)
                verticalLineTo(6f)
                curveTo(4.25f, 3.77f, 4.25f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(19.75f, 1.25f, 19.75f, 3.77f, 19.75f, 6f)
                verticalLineTo(12f)
                curveTo(19.75f, 12.41f, 19.41f, 12.75f, 19f, 12.75f)
                close()
            }
        }.build()

        return _DirectboxDefault!!
    }

@Suppress("ObjectPropertyName")
private var _DirectboxDefault: ImageVector? = null
