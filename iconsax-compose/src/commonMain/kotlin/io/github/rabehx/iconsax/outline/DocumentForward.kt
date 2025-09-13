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

val Iconsax.Outline.DocumentForward: ImageVector
    get() {
        if (_DocumentForward != null) {
            return _DocumentForward!!
        }
        _DocumentForward = ImageVector.Builder(
            name = "Outline.DocumentForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 17.75f)
                curveTo(10.81f, 17.75f, 10.62f, 17.68f, 10.47f, 17.53f)
                curveTo(10.18f, 17.24f, 10.18f, 16.76f, 10.47f, 16.47f)
                lineTo(11.19f, 15.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 15.75f, 6.25f, 15.41f, 6.25f, 15f)
                curveTo(6.25f, 14.59f, 6.59f, 14.25f, 7f, 14.25f)
                horizontalLineTo(11.19f)
                lineTo(10.47f, 13.53f)
                curveTo(10.32f, 13.38f, 10.25f, 13.19f, 10.25f, 13f)
                curveTo(10.25f, 12.81f, 10.32f, 12.62f, 10.47f, 12.47f)
                curveTo(10.76f, 12.18f, 11.24f, 12.18f, 11.53f, 12.47f)
                lineTo(13.53f, 14.47f)
                curveTo(13.66f, 14.6f, 13.73f, 14.77f, 13.74f, 14.93f)
                curveTo(13.74f, 14.98f, 13.74f, 15.04f, 13.74f, 15.09f)
                curveTo(13.72f, 15.23f, 13.66f, 15.36f, 13.56f, 15.48f)
                curveTo(13.55f, 15.49f, 13.53f, 15.51f, 13.52f, 15.52f)
                lineTo(11.52f, 17.52f)
                curveTo(11.38f, 17.68f, 11.19f, 17.75f, 11f, 17.75f)
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

        return _DocumentForward!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentForward: ImageVector? = null
