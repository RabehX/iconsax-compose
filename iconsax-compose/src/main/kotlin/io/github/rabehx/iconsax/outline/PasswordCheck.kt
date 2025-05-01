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

val Iconsax.Outline.PasswordCheck: ImageVector
    get() {
        if (_PasswordCheck != null) {
            return _PasswordCheck!!
        }
        _PasswordCheck = ImageVector.Builder(
            name = "Outline.PasswordCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.02f, 20.25f)
                horizontalLineTo(7.5f)
                curveTo(6.75f, 20.25f, 6.2f, 20.22f, 5.73f, 20.15f)
                curveTo(2.4f, 19.78f, 1.75f, 17.8f, 1.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(1.75f, 6.2f, 2.41f, 4.21f, 5.76f, 3.84f)
                curveTo(6.2f, 3.78f, 6.75f, 3.75f, 7.5f, 3.75f)
                horizontalLineTo(10.96f)
                curveTo(11.37f, 3.75f, 11.71f, 4.09f, 11.71f, 4.5f)
                curveTo(11.71f, 4.91f, 11.37f, 5.25f, 10.96f, 5.25f)
                horizontalLineTo(7.5f)
                curveTo(6.82f, 5.25f, 6.34f, 5.28f, 5.95f, 5.33f)
                curveTo(3.92f, 5.55f, 3.25f, 6.19f, 3.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(3.25f, 17.81f, 3.92f, 18.44f, 5.92f, 18.67f)
                curveTo(6.34f, 18.73f, 6.82f, 18.75f, 7.5f, 18.75f)
                horizontalLineTo(11.02f)
                curveTo(11.43f, 18.75f, 11.77f, 19.09f, 11.77f, 19.5f)
                curveTo(11.77f, 19.91f, 11.43f, 20.25f, 11.02f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 20.25f)
                horizontalLineTo(15.019f)
                curveTo(14.609f, 20.25f, 14.269f, 19.91f, 14.269f, 19.5f)
                curveTo(14.269f, 19.09f, 14.609f, 18.75f, 15.019f, 18.75f)
                horizontalLineTo(16.5f)
                curveTo(17.18f, 18.75f, 17.66f, 18.72f, 18.049f, 18.67f)
                curveTo(20.08f, 18.45f, 20.75f, 17.81f, 20.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(20.75f, 6.19f, 20.08f, 5.56f, 18.08f, 5.33f)
                curveTo(17.66f, 5.27f, 17.18f, 5.25f, 16.5f, 5.25f)
                horizontalLineTo(15.019f)
                curveTo(14.609f, 5.25f, 14.269f, 4.91f, 14.269f, 4.5f)
                curveTo(14.269f, 4.09f, 14.609f, 3.75f, 15.019f, 3.75f)
                horizontalLineTo(16.5f)
                curveTo(17.25f, 3.75f, 17.799f, 3.78f, 18.27f, 3.85f)
                curveTo(21.6f, 4.22f, 22.25f, 6.2f, 22.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(22.25f, 17.8f, 21.59f, 19.79f, 18.24f, 20.16f)
                curveTo(17.799f, 20.22f, 17.25f, 20.25f, 16.5f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                curveTo(14.59f, 22.75f, 14.25f, 22.41f, 14.25f, 22f)
                verticalLineTo(2f)
                curveTo(14.25f, 1.59f, 14.59f, 1.25f, 15f, 1.25f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                verticalLineTo(22f)
                curveTo(15.75f, 22.41f, 15.41f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.699f, 13f)
                curveTo(6.569f, 13f, 6.439f, 12.97f, 6.319f, 12.92f)
                curveTo(6.199f, 12.87f, 6.089f, 12.8f, 5.989f, 12.71f)
                curveTo(5.899f, 12.61f, 5.819f, 12.5f, 5.769f, 12.38f)
                curveTo(5.719f, 12.26f, 5.699f, 12.13f, 5.699f, 12f)
                curveTo(5.699f, 11.74f, 5.809f, 11.48f, 5.989f, 11.29f)
                curveTo(6.359f, 10.92f, 7.029f, 10.92f, 7.409f, 11.29f)
                curveTo(7.589f, 11.48f, 7.699f, 11.74f, 7.699f, 12f)
                curveTo(7.699f, 12.13f, 7.669f, 12.26f, 7.619f, 12.38f)
                curveTo(7.569f, 12.5f, 7.499f, 12.61f, 7.409f, 12.71f)
                curveTo(7.309f, 12.8f, 7.199f, 12.87f, 7.079f, 12.92f)
                curveTo(6.959f, 12.97f, 6.829f, 13f, 6.699f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.699f, 13f)
                curveTo(10.569f, 13f, 10.439f, 12.97f, 10.319f, 12.92f)
                curveTo(10.199f, 12.87f, 10.089f, 12.8f, 9.989f, 12.71f)
                curveTo(9.899f, 12.61f, 9.829f, 12.5f, 9.769f, 12.38f)
                curveTo(9.729f, 12.26f, 9.699f, 12.13f, 9.699f, 12f)
                curveTo(9.699f, 11.74f, 9.809f, 11.48f, 9.989f, 11.29f)
                curveTo(10.359f, 10.92f, 11.039f, 10.92f, 11.409f, 11.29f)
                curveTo(11.589f, 11.48f, 11.699f, 11.74f, 11.699f, 12f)
                curveTo(11.699f, 12.13f, 11.669f, 12.26f, 11.619f, 12.38f)
                curveTo(11.569f, 12.5f, 11.499f, 12.61f, 11.409f, 12.71f)
                curveTo(11.309f, 12.8f, 11.199f, 12.87f, 11.079f, 12.92f)
                curveTo(10.959f, 12.97f, 10.829f, 13f, 10.699f, 13f)
                close()
            }
        }.build()

        return _PasswordCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PasswordCheck: ImageVector? = null
