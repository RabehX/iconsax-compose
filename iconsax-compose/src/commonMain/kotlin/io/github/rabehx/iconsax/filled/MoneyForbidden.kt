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


val Iconsax.Filled.MoneyForbidden: ImageVector
    get() {
        if (_MoneyForbidden != null) {
            return _MoneyForbidden!!
        }
        _MoneyForbidden = ImageVector.Builder(
            name = "Filled.MoneyForbidden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.7f, 20.24f)
                curveTo(1.71f, 20.23f, 1.71f, 20.22f, 1.71f, 20.22f)
                lineTo(7.21f, 14.72f)
                curveTo(7.22f, 14.71f, 7.23f, 14.71f, 7.24f, 14.7f)
                curveTo(6.61f, 14.26f, 5.84f, 14f, 5f, 14f)
                curveTo(2.79f, 14f, 1f, 15.79f, 1f, 18f)
                curveTo(1f, 18.75f, 1.21f, 19.46f, 1.58f, 20.06f)
                curveTo(1.62f, 20.12f, 1.66f, 20.18f, 1.7f, 20.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.3f, 15.75f)
                curveTo(8.29f, 15.76f, 8.29f, 15.77f, 8.28f, 15.78f)
                lineTo(2.78f, 21.28f)
                curveTo(2.77f, 21.29f, 2.76f, 21.29f, 2.75f, 21.3f)
                curveTo(3.39f, 21.74f, 4.16f, 22f, 5f, 22f)
                curveTo(6.46f, 22f, 7.73f, 21.22f, 8.42f, 20.06f)
                curveTo(8.79f, 19.46f, 9f, 18.75f, 9f, 18f)
                curveTo(9f, 17.16f, 8.74f, 16.39f, 8.3f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 4f)
                horizontalLineTo(7f)
                curveTo(4f, 4f, 2f, 5.5f, 2f, 9f)
                verticalLineTo(12.56f)
                curveTo(2f, 12.93f, 2.38f, 13.16f, 2.71f, 13.01f)
                curveTo(3.69f, 12.56f, 4.82f, 12.39f, 6.01f, 12.6f)
                curveTo(8.64f, 13.07f, 10.57f, 15.51f, 10.5f, 18.18f)
                curveTo(10.49f, 18.6f, 10.43f, 19.01f, 10.32f, 19.41f)
                curveTo(10.24f, 19.72f, 10.49f, 20.01f, 10.81f, 20.01f)
                horizontalLineTo(17f)
                curveTo(20f, 20.01f, 22f, 18.51f, 22f, 15.01f)
                verticalLineTo(9f)
                curveTo(22f, 5.5f, 20f, 4f, 17f, 4f)
                close()
                moveTo(12f, 14.5f)
                curveTo(10.62f, 14.5f, 9.5f, 13.38f, 9.5f, 12f)
                curveTo(9.5f, 10.62f, 10.62f, 9.5f, 12f, 9.5f)
                curveTo(13.38f, 9.5f, 14.5f, 10.62f, 14.5f, 12f)
                curveTo(14.5f, 13.38f, 13.38f, 14.5f, 12f, 14.5f)
                close()
                moveTo(19.25f, 14f)
                curveTo(19.25f, 14.41f, 18.91f, 14.75f, 18.5f, 14.75f)
                curveTo(18.09f, 14.75f, 17.75f, 14.41f, 17.75f, 14f)
                verticalLineTo(10f)
                curveTo(17.75f, 9.59f, 18.09f, 9.25f, 18.5f, 9.25f)
                curveTo(18.91f, 9.25f, 19.25f, 9.59f, 19.25f, 10f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _MoneyForbidden!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyForbidden: ImageVector? = null
