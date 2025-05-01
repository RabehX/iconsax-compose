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


val Iconsax.Filled.Trash: ImageVector
    get() {
        if (_Trash != null) {
            return _Trash!!
        }
        _Trash = ImageVector.Builder(
            name = "Filled.Trash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.07f, 5.23f)
                curveTo(19.46f, 5.07f, 17.85f, 4.95f, 16.23f, 4.86f)
                verticalLineTo(4.85f)
                lineTo(16.01f, 3.55f)
                curveTo(15.86f, 2.63f, 15.64f, 1.25f, 13.3f, 1.25f)
                horizontalLineTo(10.68f)
                curveTo(8.35f, 1.25f, 8.13f, 2.57f, 7.97f, 3.54f)
                lineTo(7.76f, 4.82f)
                curveTo(6.83f, 4.88f, 5.9f, 4.94f, 4.97f, 5.03f)
                lineTo(2.93f, 5.23f)
                curveTo(2.51f, 5.27f, 2.21f, 5.64f, 2.25f, 6.05f)
                curveTo(2.29f, 6.46f, 2.65f, 6.76f, 3.07f, 6.72f)
                lineTo(5.11f, 6.52f)
                curveTo(10.35f, 6f, 15.63f, 6.2f, 20.93f, 6.73f)
                curveTo(20.96f, 6.73f, 20.98f, 6.73f, 21.01f, 6.73f)
                curveTo(21.39f, 6.73f, 21.72f, 6.44f, 21.76f, 6.05f)
                curveTo(21.79f, 5.64f, 21.49f, 5.27f, 21.07f, 5.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.23f, 8.14f)
                curveTo(18.99f, 7.89f, 18.66f, 7.75f, 18.32f, 7.75f)
                horizontalLineTo(5.68f)
                curveTo(5.34f, 7.75f, 5f, 7.89f, 4.77f, 8.14f)
                curveTo(4.54f, 8.39f, 4.41f, 8.73f, 4.43f, 9.08f)
                lineTo(5.05f, 19.34f)
                curveTo(5.16f, 20.86f, 5.3f, 22.76f, 8.79f, 22.76f)
                horizontalLineTo(15.21f)
                curveTo(18.7f, 22.76f, 18.84f, 20.87f, 18.95f, 19.34f)
                lineTo(19.57f, 9.09f)
                curveTo(19.59f, 8.73f, 19.46f, 8.39f, 19.23f, 8.14f)
                close()
                moveTo(13.66f, 17.75f)
                horizontalLineTo(10.33f)
                curveTo(9.92f, 17.75f, 9.58f, 17.41f, 9.58f, 17f)
                curveTo(9.58f, 16.59f, 9.92f, 16.25f, 10.33f, 16.25f)
                horizontalLineTo(13.66f)
                curveTo(14.07f, 16.25f, 14.41f, 16.59f, 14.41f, 17f)
                curveTo(14.41f, 17.41f, 14.07f, 17.75f, 13.66f, 17.75f)
                close()
                moveTo(14.5f, 13.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 13.75f, 8.75f, 13.41f, 8.75f, 13f)
                curveTo(8.75f, 12.59f, 9.09f, 12.25f, 9.5f, 12.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 12.25f, 15.25f, 12.59f, 15.25f, 13f)
                curveTo(15.25f, 13.41f, 14.91f, 13.75f, 14.5f, 13.75f)
                close()
            }
        }.build()

        return _Trash!!
    }

@Suppress("ObjectPropertyName")
private var _Trash: ImageVector? = null
