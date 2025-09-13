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


val Iconsax.Filled.PasswordCheck: ImageVector
    get() {
        if (_PasswordCheck != null) {
            return _PasswordCheck!!
        }
        _PasswordCheck = ImageVector.Builder(
            name = "Filled.PasswordCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 4f)
                horizontalLineTo(15.75f)
                verticalLineTo(2.75f)
                curveTo(15.75f, 2.34f, 15.41f, 2f, 15f, 2f)
                curveTo(14.59f, 2f, 14.25f, 2.34f, 14.25f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(14.25f, 21.66f, 14.59f, 22f, 15f, 22f)
                curveTo(15.41f, 22f, 15.75f, 21.66f, 15.75f, 21.25f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                curveTo(20.21f, 20f, 22f, 18.21f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 5.79f, 20.21f, 4f, 18f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.5f, 4f)
                curveTo(4.29f, 4f, 2.5f, 5.79f, 2.5f, 8f)
                verticalLineTo(16f)
                curveTo(2.5f, 18.21f, 4.29f, 20f, 6.5f, 20f)
                horizontalLineTo(11.5f)
                curveTo(12.05f, 20f, 12.5f, 19.55f, 12.5f, 19f)
                verticalLineTo(5f)
                curveTo(12.5f, 4.45f, 12.05f, 4f, 11.5f, 4f)
                horizontalLineTo(6.5f)
                close()
                moveTo(6.67f, 12.38f)
                curveTo(6.62f, 12.5f, 6.55f, 12.61f, 6.46f, 12.71f)
                curveTo(6.36f, 12.8f, 6.25f, 12.87f, 6.13f, 12.92f)
                curveTo(6.01f, 12.97f, 5.88f, 13f, 5.75f, 13f)
                curveTo(5.62f, 13f, 5.49f, 12.97f, 5.37f, 12.92f)
                curveTo(5.25f, 12.87f, 5.14f, 12.8f, 5.04f, 12.71f)
                curveTo(4.95f, 12.61f, 4.88f, 12.5f, 4.82f, 12.38f)
                curveTo(4.77f, 12.26f, 4.75f, 12.13f, 4.75f, 12f)
                curveTo(4.75f, 11.74f, 4.86f, 11.48f, 5.04f, 11.29f)
                curveTo(5.09f, 11.25f, 5.14f, 11.21f, 5.19f, 11.17f)
                curveTo(5.25f, 11.13f, 5.31f, 11.1f, 5.37f, 11.08f)
                curveTo(5.43f, 11.05f, 5.49f, 11.03f, 5.55f, 11.02f)
                curveTo(5.89f, 10.95f, 6.23f, 11.06f, 6.46f, 11.29f)
                curveTo(6.64f, 11.48f, 6.75f, 11.74f, 6.75f, 12f)
                curveTo(6.75f, 12.13f, 6.72f, 12.26f, 6.67f, 12.38f)
                close()
                moveTo(10.17f, 12.38f)
                curveTo(10.12f, 12.5f, 10.05f, 12.61f, 9.96f, 12.71f)
                curveTo(9.86f, 12.8f, 9.75f, 12.87f, 9.63f, 12.92f)
                curveTo(9.51f, 12.97f, 9.38f, 13f, 9.25f, 13f)
                curveTo(9.12f, 13f, 8.99f, 12.97f, 8.87f, 12.92f)
                curveTo(8.75f, 12.87f, 8.64f, 12.8f, 8.54f, 12.71f)
                curveTo(8.35f, 12.52f, 8.25f, 12.27f, 8.25f, 12f)
                curveTo(8.25f, 11.87f, 8.28f, 11.74f, 8.33f, 11.62f)
                curveTo(8.38f, 11.49f, 8.45f, 11.39f, 8.54f, 11.29f)
                curveTo(8.91f, 10.92f, 9.58f, 10.92f, 9.96f, 11.29f)
                curveTo(10.14f, 11.48f, 10.25f, 11.74f, 10.25f, 12f)
                curveTo(10.25f, 12.13f, 10.22f, 12.26f, 10.17f, 12.38f)
                close()
            }
        }.build()

        return _PasswordCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PasswordCheck: ImageVector? = null
