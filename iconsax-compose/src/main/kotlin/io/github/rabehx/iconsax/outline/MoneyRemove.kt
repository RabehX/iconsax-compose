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

val Iconsax.Outline.MoneyRemove: ImageVector
    get() {
        if (_MoneyRemove != null) {
            return _MoneyRemove!!
        }
        _MoneyRemove = ImageVector.Builder(
            name = "Outline.MoneyRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 20.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 20.75f, 7.75f, 20.41f, 7.75f, 20f)
                curveTo(7.75f, 19.59f, 8.09f, 19.25f, 8.5f, 19.25f)
                horizontalLineTo(17f)
                curveTo(19.86f, 19.25f, 21.25f, 17.86f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 6.14f, 19.86f, 4.75f, 17f, 4.75f)
                horizontalLineTo(7f)
                curveTo(4.14f, 4.75f, 2.75f, 6.14f, 2.75f, 9f)
                verticalLineTo(15.3f)
                curveTo(2.75f, 15.71f, 2.41f, 16.05f, 2f, 16.05f)
                curveTo(1.59f, 16.05f, 1.25f, 15.71f, 1.25f, 15.3f)
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
                moveTo(5f, 22.75f)
                curveTo(3.34f, 22.75f, 1.78f, 21.87f, 0.94f, 20.44f)
                curveTo(0.49f, 19.72f, 0.25f, 18.87f, 0.25f, 18f)
                curveTo(0.25f, 15.38f, 2.38f, 13.25f, 5f, 13.25f)
                curveTo(7.62f, 13.25f, 9.75f, 15.38f, 9.75f, 18f)
                curveTo(9.75f, 18.87f, 9.51f, 19.72f, 9.06f, 20.45f)
                curveTo(8.22f, 21.87f, 6.66f, 22.75f, 5f, 22.75f)
                close()
                moveTo(5f, 14.75f)
                curveTo(3.21f, 14.75f, 1.75f, 16.21f, 1.75f, 18f)
                curveTo(1.75f, 18.59f, 1.91f, 19.17f, 2.22f, 19.67f)
                curveTo(2.8f, 20.65f, 3.87f, 21.25f, 5f, 21.25f)
                curveTo(6.13f, 21.25f, 7.2f, 20.65f, 7.78f, 19.68f)
                curveTo(8.09f, 19.17f, 8.25f, 18.6f, 8.25f, 18f)
                curveTo(8.25f, 16.21f, 6.79f, 14.75f, 5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.07f, 19.79f)
                curveTo(5.88f, 19.79f, 5.69f, 19.72f, 5.54f, 19.57f)
                lineTo(3.43f, 17.46f)
                curveTo(3.14f, 17.17f, 3.14f, 16.69f, 3.43f, 16.4f)
                curveTo(3.72f, 16.11f, 4.2f, 16.11f, 4.49f, 16.4f)
                lineTo(6.6f, 18.51f)
                curveTo(6.89f, 18.8f, 6.89f, 19.28f, 6.6f, 19.57f)
                curveTo(6.45f, 19.72f, 6.26f, 19.79f, 6.07f, 19.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.931f, 19.82f)
                curveTo(3.741f, 19.82f, 3.551f, 19.75f, 3.401f, 19.6f)
                curveTo(3.111f, 19.31f, 3.111f, 18.83f, 3.401f, 18.54f)
                lineTo(5.511f, 16.43f)
                curveTo(5.801f, 16.14f, 6.281f, 16.14f, 6.571f, 16.43f)
                curveTo(6.861f, 16.72f, 6.861f, 17.2f, 6.571f, 17.49f)
                lineTo(4.461f, 19.6f)
                curveTo(4.311f, 19.75f, 4.121f, 19.82f, 3.931f, 19.82f)
                close()
            }
        }.build()

        return _MoneyRemove!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyRemove: ImageVector? = null
