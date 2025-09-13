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

val Iconsax.Outline.MirroringScreen: ImageVector
    get() {
        if (_MirroringScreen != null) {
            return _MirroringScreen!!
        }
        _MirroringScreen = ImageVector.Builder(
            name = "Outline.MirroringScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 21.75f)
                horizontalLineTo(16f)
                curveTo(15.59f, 21.75f, 15.25f, 21.41f, 15.25f, 21f)
                curveTo(15.25f, 20.59f, 15.59f, 20.25f, 16f, 20.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 20.25f, 21.25f, 18.58f, 21.25f, 16f)
                verticalLineTo(8f)
                curveTo(21.25f, 5.42f, 19.58f, 3.75f, 17f, 3.75f)
                horizontalLineTo(7f)
                curveTo(4.42f, 3.75f, 2.75f, 5.42f, 2.75f, 8f)
                verticalLineTo(9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                verticalLineTo(8f)
                curveTo(1.25f, 4.56f, 3.56f, 2.25f, 7f, 2.25f)
                horizontalLineTo(17f)
                curveTo(20.44f, 2.25f, 22.75f, 4.56f, 22.75f, 8f)
                verticalLineTo(16f)
                curveTo(22.75f, 19.44f, 20.44f, 21.75f, 17f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.29f, 21.06f)
                curveTo(11.92f, 21.06f, 11.6f, 20.78f, 11.55f, 20.41f)
                curveTo(11f, 16.13f, 7.88f, 13f, 3.59f, 12.45f)
                curveTo(3.18f, 12.4f, 2.89f, 12.02f, 2.94f, 11.61f)
                curveTo(2.99f, 11.2f, 3.37f, 10.91f, 3.78f, 10.96f)
                curveTo(8.76f, 11.6f, 12.4f, 15.23f, 13.03f, 20.21f)
                curveTo(13.08f, 20.62f, 12.79f, 21f, 12.38f, 21.05f)
                curveTo(12.36f, 21.06f, 12.32f, 21.06f, 12.29f, 21.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.93f, 22.13f)
                curveTo(8.56f, 22.13f, 8.24f, 21.85f, 8.19f, 21.48f)
                curveTo(7.8f, 18.43f, 5.57f, 16.2f, 2.52f, 15.81f)
                curveTo(2.11f, 15.76f, 1.82f, 15.38f, 1.87f, 14.97f)
                curveTo(1.92f, 14.56f, 2.3f, 14.27f, 2.71f, 14.32f)
                curveTo(6.46f, 14.8f, 9.19f, 17.54f, 9.67f, 21.28f)
                curveTo(9.72f, 21.69f, 9.43f, 22.07f, 9.02f, 22.12f)
                curveTo(8.99f, 22.13f, 8.96f, 22.13f, 8.93f, 22.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.13f, 22.77f)
                curveTo(4.76f, 22.77f, 4.44f, 22.49f, 4.39f, 22.12f)
                curveTo(4.22f, 20.77f, 3.23f, 19.78f, 1.88f, 19.61f)
                curveTo(1.47f, 19.56f, 1.18f, 19.18f, 1.23f, 18.77f)
                curveTo(1.28f, 18.36f, 1.66f, 18.07f, 2.07f, 18.12f)
                curveTo(4.09f, 18.38f, 5.62f, 19.91f, 5.88f, 21.93f)
                curveTo(5.93f, 22.34f, 5.64f, 22.72f, 5.23f, 22.77f)
                curveTo(5.2f, 22.77f, 5.17f, 22.77f, 5.13f, 22.77f)
                close()
            }
        }.build()

        return _MirroringScreen!!
    }

@Suppress("ObjectPropertyName")
private var _MirroringScreen: ImageVector? = null
