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

val Iconsax.Outline.TrendUp: ImageVector
    get() {
        if (_TrendUp != null) {
            return _TrendUp!!
        }
        _TrendUp = ImageVector.Builder(
            name = "Outline.TrendUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 15.25f)
                curveTo(7.31f, 15.25f, 7.12f, 15.18f, 6.97f, 15.03f)
                curveTo(6.68f, 14.74f, 6.68f, 14.26f, 6.97f, 13.97f)
                lineTo(10.17f, 10.77f)
                curveTo(10.33f, 10.61f, 10.54f, 10.53f, 10.77f, 10.55f)
                curveTo(10.99f, 10.57f, 11.19f, 10.69f, 11.32f, 10.88f)
                lineTo(12.41f, 12.52f)
                lineTo(15.96f, 8.97f)
                curveTo(16.25f, 8.68f, 16.73f, 8.68f, 17.02f, 8.97f)
                curveTo(17.31f, 9.26f, 17.31f, 9.74f, 17.02f, 10.03f)
                lineTo(12.82f, 14.23f)
                curveTo(12.66f, 14.39f, 12.45f, 14.47f, 12.22f, 14.45f)
                curveTo(12f, 14.43f, 11.8f, 14.31f, 11.67f, 14.12f)
                lineTo(10.58f, 12.48f)
                lineTo(8.03f, 15.03f)
                curveTo(7.88f, 15.18f, 7.69f, 15.25f, 7.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 12.25f)
                curveTo(16.09f, 12.25f, 15.75f, 11.91f, 15.75f, 11.5f)
                verticalLineTo(10.25f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 10.25f, 13.75f, 9.91f, 13.75f, 9.5f)
                curveTo(13.75f, 9.09f, 14.09f, 8.75f, 14.5f, 8.75f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 8.75f, 17.25f, 9.09f, 17.25f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(17.25f, 11.91f, 16.91f, 12.25f, 16.5f, 12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _TrendUp!!
    }

@Suppress("ObjectPropertyName")
private var _TrendUp: ImageVector? = null
