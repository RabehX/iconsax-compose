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

val Iconsax.Outline.LockSlash: ImageVector
    get() {
        if (_LockSlash != null) {
            return _LockSlash!!
        }
        _LockSlash = ImageVector.Builder(
            name = "Outline.LockSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.25f)
                curveTo(10.98f, 19.25f, 10.04f, 18.79f, 9.42f, 17.98f)
                curveTo(9.17f, 17.65f, 9.23f, 17.18f, 9.56f, 16.93f)
                curveTo(9.89f, 16.68f, 10.36f, 16.74f, 10.61f, 17.07f)
                curveTo(10.94f, 17.51f, 11.45f, 17.75f, 12f, 17.75f)
                curveTo(12.96f, 17.75f, 13.75f, 16.96f, 13.75f, 16f)
                curveTo(13.75f, 15.61f, 13.63f, 15.24f, 13.39f, 14.94f)
                curveTo(13.14f, 14.61f, 13.2f, 14.14f, 13.53f, 13.89f)
                curveTo(13.86f, 13.64f, 14.33f, 13.7f, 14.58f, 14.03f)
                curveTo(15.02f, 14.6f, 15.25f, 15.28f, 15.25f, 16f)
                curveTo(15.25f, 17.79f, 13.79f, 19.25f, 12f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(6.63f, 22.75f, 6.28f, 22.74f, 5.95f, 22.72f)
                curveTo(5.54f, 22.7f, 5.22f, 22.34f, 5.24f, 21.93f)
                curveTo(5.26f, 21.52f, 5.61f, 21.22f, 6.03f, 21.22f)
                curveTo(6.33f, 21.24f, 6.65f, 21.24f, 6.99f, 21.24f)
                horizontalLineTo(16.99f)
                curveTo(20.56f, 21.24f, 21.24f, 20.56f, 21.24f, 16.99f)
                verticalLineTo(14.99f)
                curveTo(21.24f, 11.48f, 20.5f, 10.91f, 17.95f, 10.76f)
                curveTo(17.65f, 10.74f, 17.33f, 10.74f, 16.99f, 10.74f)
                horizontalLineTo(7f)
                curveTo(3.43f, 10.74f, 2.75f, 11.42f, 2.75f, 14.99f)
                verticalLineTo(16.99f)
                curveTo(2.75f, 18.73f, 2.95f, 19.76f, 3.41f, 20.32f)
                curveTo(3.67f, 20.64f, 3.62f, 21.12f, 3.29f, 21.37f)
                curveTo(2.97f, 21.63f, 2.5f, 21.58f, 2.24f, 21.25f)
                curveTo(1.54f, 20.4f, 1.25f, 19.16f, 1.25f, 17f)
                verticalLineTo(15f)
                curveTo(1.25f, 10.59f, 2.59f, 9.25f, 7f, 9.25f)
                horizontalLineTo(17f)
                curveTo(17.37f, 9.25f, 17.72f, 9.26f, 18.04f, 9.28f)
                curveTo(22f, 9.5f, 22.75f, 11.46f, 22.75f, 15f)
                verticalLineTo(17f)
                curveTo(22.75f, 21.41f, 21.41f, 22.75f, 17f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 10.75f)
                curveTo(5.59f, 10.75f, 5.25f, 10.41f, 5.25f, 10f)
                verticalLineTo(8f)
                curveTo(5.25f, 5.1f, 5.95f, 1.25f, 12f, 1.25f)
                curveTo(16.07f, 1.25f, 18.18f, 2.58f, 18.64f, 5.44f)
                curveTo(18.71f, 5.85f, 18.43f, 6.23f, 18.02f, 6.3f)
                curveTo(17.61f, 6.37f, 17.23f, 6.09f, 17.16f, 5.68f)
                curveTo(16.91f, 4.16f, 16.12f, 2.75f, 12f, 2.75f)
                curveTo(7.64f, 2.75f, 6.75f, 4.85f, 6.75f, 8f)
                verticalLineTo(10f)
                curveTo(6.75f, 10.41f, 6.41f, 10.75f, 6f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _LockSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LockSlash: ImageVector? = null
