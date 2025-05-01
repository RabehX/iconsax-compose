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

val Iconsax.Outline.DocumentUpload: ImageVector
    get() {
        if (_DocumentUpload != null) {
            return _DocumentUpload!!
        }
        _DocumentUpload = ImageVector.Builder(
            name = "Outline.DocumentUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.999f, 17.75f)
                curveTo(8.589f, 17.75f, 8.249f, 17.41f, 8.249f, 17f)
                verticalLineTo(12.81f)
                lineTo(7.529f, 13.53f)
                curveTo(7.239f, 13.82f, 6.759f, 13.82f, 6.469f, 13.53f)
                curveTo(6.179f, 13.24f, 6.179f, 12.76f, 6.469f, 12.47f)
                lineTo(8.469f, 10.47f)
                curveTo(8.679f, 10.26f, 9.009f, 10.19f, 9.289f, 10.31f)
                curveTo(9.569f, 10.42f, 9.749f, 10.7f, 9.749f, 11f)
                verticalLineTo(17f)
                curveTo(9.749f, 17.41f, 9.409f, 17.75f, 8.999f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 13.75f)
                curveTo(10.809f, 13.75f, 10.62f, 13.68f, 10.469f, 13.53f)
                lineTo(8.469f, 11.53f)
                curveTo(8.179f, 11.24f, 8.179f, 10.76f, 8.469f, 10.47f)
                curveTo(8.759f, 10.18f, 9.239f, 10.18f, 9.529f, 10.47f)
                lineTo(11.53f, 12.47f)
                curveTo(11.819f, 12.76f, 11.819f, 13.24f, 11.53f, 13.53f)
                curveTo(11.38f, 13.68f, 11.189f, 13.75f, 11f, 13.75f)
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

        return _DocumentUpload!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentUpload: ImageVector? = null
