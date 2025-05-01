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

val Iconsax.Outline.DocumentDownload: ImageVector
    get() {
        if (_DocumentDownload != null) {
            return _DocumentDownload!!
        }
        _DocumentDownload = ImageVector.Builder(
            name = "Outline.DocumentDownload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 17.75f)
                curveTo(8.9f, 17.75f, 8.81f, 17.73f, 8.71f, 17.69f)
                curveTo(8.43f, 17.58f, 8.25f, 17.3f, 8.25f, 17f)
                verticalLineTo(11f)
                curveTo(8.25f, 10.59f, 8.59f, 10.25f, 9f, 10.25f)
                curveTo(9.41f, 10.25f, 9.75f, 10.59f, 9.75f, 11f)
                verticalLineTo(15.19f)
                lineTo(10.47f, 14.47f)
                curveTo(10.76f, 14.18f, 11.24f, 14.18f, 11.53f, 14.47f)
                curveTo(11.82f, 14.76f, 11.82f, 15.24f, 11.53f, 15.53f)
                lineTo(9.53f, 17.53f)
                curveTo(9.39f, 17.67f, 9.19f, 17.75f, 9f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.999f, 17.75f)
                curveTo(8.809f, 17.75f, 8.619f, 17.68f, 8.469f, 17.53f)
                lineTo(6.469f, 15.53f)
                curveTo(6.179f, 15.24f, 6.179f, 14.76f, 6.469f, 14.47f)
                curveTo(6.759f, 14.18f, 7.239f, 14.18f, 7.529f, 14.47f)
                lineTo(9.529f, 16.47f)
                curveTo(9.819f, 16.76f, 9.819f, 17.24f, 9.529f, 17.53f)
                curveTo(9.379f, 17.68f, 9.189f, 17.75f, 8.999f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 1.25f, 14.75f, 1.59f, 14.75f, 2f)
                curveTo(14.75f, 2.41f, 14.41f, 2.75f, 14f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(10f)
                curveTo(21.25f, 9.59f, 21.59f, 9.25f, 22f, 9.25f)
                curveTo(22.41f, 9.25f, 22.75f, 9.59f, 22.75f, 10f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 10.75f)
                horizontalLineTo(18f)
                curveTo(14.58f, 10.75f, 13.25f, 9.42f, 13.25f, 6f)
                verticalLineTo(2f)
                curveTo(13.25f, 1.7f, 13.43f, 1.42f, 13.71f, 1.31f)
                curveTo(13.99f, 1.19f, 14.31f, 1.26f, 14.53f, 1.47f)
                lineTo(22.53f, 9.47f)
                curveTo(22.74f, 9.68f, 22.81f, 10.01f, 22.69f, 10.29f)
                curveTo(22.57f, 10.57f, 22.3f, 10.75f, 22f, 10.75f)
                close()
                moveTo(14.75f, 3.81f)
                verticalLineTo(6f)
                curveTo(14.75f, 8.58f, 15.42f, 9.25f, 18f, 9.25f)
                horizontalLineTo(20.19f)
                lineTo(14.75f, 3.81f)
                close()
            }
        }.build()

        return _DocumentDownload!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentDownload: ImageVector? = null
