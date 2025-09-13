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

val Iconsax.Outline.MoneyChange: ImageVector
    get() {
        if (_MoneyChange != null) {
            return _MoneyChange!!
        }
        _MoneyChange = ImageVector.Builder(
            name = "Outline.MoneyChange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 20.75f)
                horizontalLineTo(12f)
                curveTo(11.59f, 20.75f, 11.25f, 20.41f, 11.25f, 20f)
                curveTo(11.25f, 19.59f, 11.59f, 19.25f, 12f, 19.25f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.25f, 21.25f, 17.86f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 6.14f, 19.86f, 4.75f, 17f, 4.75f)
                horizontalLineTo(7f)
                curveTo(4.14f, 4.75f, 2.75f, 6.14f, 2.75f, 9f)
                verticalLineTo(11f)
                curveTo(2.75f, 11.41f, 2.41f, 11.75f, 2f, 11.75f)
                curveTo(1.59f, 11.75f, 1.25f, 11.41f, 1.25f, 11f)
                verticalLineTo(9f)
                curveTo(1.25f, 5.35f, 3.35f, 3.25f, 7f, 3.25f)
                horizontalLineTo(17f)
                curveTo(20.65f, 3.25f, 22.75f, 5.35f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 18.65f, 20.65f, 20.75f, 17f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.25f)
                curveTo(10.21f, 15.25f, 8.75f, 13.79f, 8.75f, 12f)
                curveTo(8.75f, 10.21f, 10.21f, 8.75f, 12f, 8.75f)
                curveTo(13.79f, 8.75f, 15.25f, 10.21f, 15.25f, 12f)
                curveTo(15.25f, 13.79f, 13.79f, 15.25f, 12f, 15.25f)
                close()
                moveTo(12f, 10.25f)
                curveTo(11.04f, 10.25f, 10.25f, 11.04f, 10.25f, 12f)
                curveTo(10.25f, 12.96f, 11.04f, 13.75f, 12f, 13.75f)
                curveTo(12.96f, 13.75f, 13.75f, 12.96f, 13.75f, 12f)
                curveTo(13.75f, 11.04f, 12.96f, 10.25f, 12f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 15.25f)
                curveTo(18.09f, 15.25f, 17.75f, 14.91f, 17.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(17.75f, 9.09f, 18.09f, 8.75f, 18.5f, 8.75f)
                curveTo(18.91f, 8.75f, 19.25f, 9.09f, 19.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(19.25f, 14.91f, 18.91f, 15.25f, 18.5f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 18.69f)
                curveTo(8.09f, 18.69f, 7.75f, 18.35f, 7.75f, 17.94f)
                verticalLineTo(16.66f)
                curveTo(7.75f, 16.44f, 7.57f, 16.25f, 7.34f, 16.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 16.25f, 1.25f, 15.91f, 1.25f, 15.5f)
                curveTo(1.25f, 15.09f, 1.59f, 14.75f, 2f, 14.75f)
                horizontalLineTo(7.34f)
                curveTo(8.39f, 14.75f, 9.25f, 15.61f, 9.25f, 16.66f)
                verticalLineTo(17.94f)
                curveTo(9.25f, 18.35f, 8.91f, 18.69f, 8.5f, 18.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.219f, 17.47f)
                curveTo(3.029f, 17.47f, 2.839f, 17.4f, 2.689f, 17.25f)
                lineTo(1.469f, 16.03f)
                curveTo(1.179f, 15.74f, 1.179f, 15.26f, 1.469f, 14.97f)
                lineTo(2.689f, 13.75f)
                curveTo(2.979f, 13.46f, 3.459f, 13.46f, 3.749f, 13.75f)
                curveTo(4.039f, 14.04f, 4.039f, 14.52f, 3.749f, 14.81f)
                lineTo(3.059f, 15.5f)
                lineTo(3.749f, 16.19f)
                curveTo(4.039f, 16.48f, 4.039f, 16.96f, 3.749f, 17.25f)
                curveTo(3.599f, 17.4f, 3.409f, 17.47f, 3.219f, 17.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 21.53f)
                horizontalLineTo(3.16f)
                curveTo(2.11f, 21.53f, 1.25f, 20.67f, 1.25f, 19.62f)
                verticalLineTo(18.34f)
                curveTo(1.25f, 17.93f, 1.59f, 17.59f, 2f, 17.59f)
                curveTo(2.41f, 17.59f, 2.75f, 17.93f, 2.75f, 18.34f)
                verticalLineTo(19.62f)
                curveTo(2.75f, 19.84f, 2.93f, 20.03f, 3.16f, 20.03f)
                horizontalLineTo(8.5f)
                curveTo(8.91f, 20.03f, 9.25f, 20.37f, 9.25f, 20.78f)
                curveTo(9.25f, 21.19f, 8.91f, 21.53f, 8.5f, 21.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.279f, 22.75f)
                curveTo(7.089f, 22.75f, 6.899f, 22.68f, 6.749f, 22.53f)
                curveTo(6.459f, 22.24f, 6.459f, 21.76f, 6.749f, 21.47f)
                lineTo(7.439f, 20.78f)
                lineTo(6.749f, 20.09f)
                curveTo(6.459f, 19.8f, 6.459f, 19.32f, 6.749f, 19.03f)
                curveTo(7.039f, 18.74f, 7.519f, 18.74f, 7.809f, 19.03f)
                lineTo(9.029f, 20.25f)
                curveTo(9.319f, 20.54f, 9.319f, 21.02f, 9.029f, 21.31f)
                lineTo(7.809f, 22.53f)
                curveTo(7.669f, 22.68f, 7.469f, 22.75f, 7.279f, 22.75f)
                close()
            }
        }.build()

        return _MoneyChange!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyChange: ImageVector? = null
