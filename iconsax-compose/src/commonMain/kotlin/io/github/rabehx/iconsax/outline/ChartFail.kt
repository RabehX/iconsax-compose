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

val Iconsax.Outline.ChartFail: ImageVector
    get() {
        if (_ChartFail != null) {
            return _ChartFail!!
        }
        _ChartFail = ImageVector.Builder(
            name = "Outline.ChartFail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.23f, 21.52f)
                curveTo(17.04f, 21.52f, 16.85f, 21.45f, 16.7f, 21.3f)
                curveTo(16.41f, 21.01f, 16.41f, 20.53f, 16.7f, 20.24f)
                lineTo(20.24f, 16.7f)
                curveTo(20.53f, 16.41f, 21.01f, 16.41f, 21.3f, 16.7f)
                curveTo(21.59f, 16.99f, 21.59f, 17.47f, 21.3f, 17.76f)
                lineTo(17.76f, 21.3f)
                curveTo(17.62f, 21.44f, 17.42f, 21.52f, 17.23f, 21.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.77f, 21.52f)
                curveTo(20.58f, 21.52f, 20.39f, 21.45f, 20.24f, 21.3f)
                lineTo(16.7f, 17.76f)
                curveTo(16.41f, 17.47f, 16.41f, 16.99f, 16.7f, 16.7f)
                curveTo(16.99f, 16.41f, 17.47f, 16.41f, 17.76f, 16.7f)
                lineTo(21.3f, 20.24f)
                curveTo(21.59f, 20.53f, 21.59f, 21.01f, 21.3f, 21.3f)
                curveTo(21.15f, 21.44f, 20.96f, 21.52f, 20.77f, 21.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7f, 14.25f)
                curveTo(6.59f, 14.25f, 6.25f, 13.91f, 6.25f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(6.25f, 10.09f, 6.59f, 9.75f, 7f, 9.75f)
                curveTo(7.41f, 9.75f, 7.75f, 10.09f, 7.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(7.75f, 13.91f, 7.41f, 14.25f, 7f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.25f)
                curveTo(11.59f, 14.25f, 11.25f, 13.91f, 11.25f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(11.25f, 10.09f, 11.59f, 9.75f, 12f, 9.75f)
                curveTo(12.41f, 9.75f, 12.75f, 10.09f, 12.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(12.75f, 13.91f, 12.41f, 14.25f, 12f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 14.25f)
                curveTo(16.59f, 14.25f, 16.25f, 13.91f, 16.25f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(16.25f, 10.09f, 16.59f, 9.75f, 17f, 9.75f)
                curveTo(17.41f, 9.75f, 17.75f, 10.09f, 17.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(17.75f, 13.91f, 17.41f, 14.25f, 17f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(13f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22f, 13.75f)
                curveTo(21.59f, 13.75f, 21.25f, 13.41f, 21.25f, 13f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(13f)
                curveTo(13.41f, 21.25f, 13.75f, 21.59f, 13.75f, 22f)
                curveTo(13.75f, 22.41f, 13.41f, 22.75f, 13f, 22.75f)
                close()
            }
        }.build()

        return _ChartFail!!
    }

@Suppress("ObjectPropertyName")
private var _ChartFail: ImageVector? = null
